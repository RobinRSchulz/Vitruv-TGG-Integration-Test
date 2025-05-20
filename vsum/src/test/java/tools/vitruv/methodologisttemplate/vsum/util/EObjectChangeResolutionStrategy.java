package tools.vitruv.methodologisttemplate.vsum.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import edu.kit.ipd.sdq.commons.util.org.eclipse.emf.ecore.resource.ResourceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures;
import tools.vitruv.change.atomic.hid.HierarchicalId;
import tools.vitruv.change.composite.description.VitruviusChange;
import tools.vitruv.change.composite.recording.ChangeRecorder;
import tools.vitruv.framework.views.changederivation.DefaultStateBasedChangeResolutionStrategy;

import java.util.Collection;

/**
 * Allow for returning a {@link VitruviusChange} generically typed with {@link EObject}
 * instead of {@link HierarchicalId}, which the superclass does.
 */
public class EObjectChangeResolutionStrategy extends DefaultStateBasedChangeResolutionStrategy {

    public VitruviusChange<EObject> getEObjectChangeSequenceForCreated(Resource newState) {
        Preconditions.checkArgument(newState != null, "new state must not be null!");
        this.checkNoProxies(newState, "new state");
        ResourceSetImpl monitoredResourceSet = new ResourceSetImpl();
        Resource newResource = monitoredResourceSet.createResource(newState.getURI());
        newResource.getContents().clear();
        Procedures.Procedure0 _function = () -> {
            EList<EObject> _contents = newResource.getContents();
            Collection<EObject> _copyAll = EcoreUtil.copyAll(newState.getContents());
            Iterables.addAll(_contents, _copyAll);
        };
        return this.record(newResource, _function);
    }


    private VitruviusChange<EObject> record(Resource resource, Procedures.Procedure0 function) {
        try (ChangeRecorder changeRecorder = new ChangeRecorder(resource.getResourceSet())) {
            changeRecorder.beginRecording();
            changeRecorder.addToRecording(resource);
            function.apply();
            return changeRecorder.endRecording();
        }
    }

    private void checkNoProxies(Resource resource, String stateNotice) {
        Iterable<EObject> proxies = ResourceUtil.getReferencedProxies(resource);
        Functions.Function1<EObject, String> _function = (it) -> it.toString();
        Preconditions.checkArgument(IterableExtensions.isEmpty(proxies), "%s '%s' should not contain proxies, but contains the following: %s", stateNotice, resource.getURI(), String.join(", ", IterableExtensions.map(proxies, _function)));
    }

}

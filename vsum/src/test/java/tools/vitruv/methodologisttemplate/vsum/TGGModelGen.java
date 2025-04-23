package tools.vitruv.methodologisttemplate.vsum;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.smartemf.SmartEMFGenerator;

import java.io.IOException;

public class TGGModelGen extends MODELGEN {

    public TGGModelGen() throws IOException {
        super(null);
    }
    public TGGModelGen(IbexOptions options) throws IOException {
        super(options);
    }

    public static void generateModel(int size) throws IOException {
        //TODO somehow generate EChange sequence out of this. IDEA maybe use protocol and my Vitruv-TGG stuff!
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        TGGModelGen generator = new TGGModelGen();

        MODELGENStopCriterion stopCriterion = new MODELGENStopCriterion(generator.getTGG());
        stopCriterion.setMaxSrcCount(size);
        long startTime = System.currentTimeMillis();
        generator.run();
        long endTime = System.currentTimeMillis();
        logger.info("Completed IBeX modelgen in " + (endTime - startTime) + "ms");

        generator.saveModels();
        generator.terminate();
    }
}

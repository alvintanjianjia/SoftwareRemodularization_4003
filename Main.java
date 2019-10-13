import bunch.api.BunchAPI;
import bunch.api.BunchProperties;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bunch Automation Start");
		BunchAPI api = new BunchAPI();
		BunchProperties bp = new BunchProperties();
		//Populate the BunchProperties object. Note that the
		//Bunch API default output file format is
		//BunchProperties.NULL_OUTPUT_FORMAT, which does not
		//produce any output files. The following example clusters
		//the MDG file "e:\incl" , and sets the output format file
		//type to dotty.
		
		
		//Example
		//bp.setProperty(BunchProperties.MDG_INPUT_FILE_NAME,"C:\\Users\\tanji\\Downloads\\examples\\examples\\swingInherit.mdg");
		//bp.setProperty(BunchProperties.OUTPUT_FILE, "C:\\Users\\tanji\\Downloads\\examples\\examples\\test1.txt");
		
		bp.setProperty(BunchProperties.MDG_INPUT_FILE_NAME,args[0]);
		bp.setProperty(BunchProperties.OUTPUT_FILE, args[1]);
		
		//bp.setProperty(BunchProperties.OUTPUT_FORMAT, BunchProperties.DOT_OUTPUT_FORMAT);
		bp.setProperty(BunchProperties.OUTPUT_FORMAT, BunchProperties.TEXT_OUTPUT_FORMAT);
		
		if (args[2] == "exhaustive") {
			bp.setProperty(BunchProperties.CLUSTERING_ALG, BunchProperties.ALG_EXHAUSTIVE);
		}
		else if (args[2] == "hillclimbing") {
			bp.setProperty(BunchProperties.CLUSTERING_ALG, BunchProperties.ALG_HILL_CLIMBING);
		}
		else if (args[2] == "ga") {
			bp.setProperty(BunchProperties.CLUSTERING_ALG, BunchProperties.ALG_GA);
		}
		
		
		api.setProperties(bp);
		//Now execute the clustering process
		System.out.println("Running...");
		api.run();
		System.out.println("Done!");
		//Get the results and display statistics for the execution time,
		//and the number of MQ evaluations that were performed.
		Hashtable results = api.getResults();
		System.out.println("Results:");
		String rt = (String)results.get(BunchAPI.RUNTIME);
		String evals = (String)results.get(BunchAPI.MQEVALUATIONS);
		System.out.println("Runtime = " + rt + " ms.");
		System.out.println("Total MQ Evaluations = " + evals);
	}

}

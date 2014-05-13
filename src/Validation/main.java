package Validation;

public class main {
	public static void main(String args[]){
		//Test Different Methods
		//Notice that the second parameter which is a measurement of energy percentage does not apply to LDA and LPP
		
//		PerformanceTestUsingOrl.testOrl(2,100,2,3,4);
//		
		PerformanceTestUsingYaleFaces.testYale(2,40,2,9,4);
	}
	
	/*metricType:
	 * 	0: CosineDissimilarity
	 * 	1: L1Distance
	 * 	2: EuclideanDistance
	 * 
	 * energyPercentage:
	 *  PCA: components = samples * energyPercentage
	 *  LDA: components = (c-1) *energyPercentage
	 *  LLP: components = (c-1) *energyPercentage
	 * 
	 * featureExtractionMode
	 * 	0: PCA
	 *	1: LDA
	 * 	2: LLP
	 * 
	 * trainNums: how many numbers in 1..10 are assigned to be training faces
	 * for each class, randomly generate the set
	 * 
	 * knn_k: number of K for KNN algorithm
	 * 
	 * */

}

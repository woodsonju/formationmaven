package fr.dawan.projetmaven;

public class Application {

	public static void main(String[] args) {
		
//		ExecutableV2 executableV2 = new ExecuteTableV2Impl();
//		executableV2.execute();
		
//		ExecutableV2 executableV2 = new ExecutableV2() {
//			
//			@Override
//			public void execute() {
//				System.out.println("je suis execute");
//				
//			}
//		};
//		
//		executableV2.execute();
		
		ExecutableV2 executableV2 = () -> System.out.println("je suis execute");
		executableV2.execute();

	}

}

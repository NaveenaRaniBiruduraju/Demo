package TestScriptPackge;

import HelpPackge.ReUsableMet;

public class VoyaahClass extends ReUsableMet{

	public static void main(String[] args) throws Exception {
		VoyaahClass abc=new VoyaahClass();
		abc.openVoyaah();
		Thread.sleep(4000);
		abc.closeVoyaah();
		
	}

}

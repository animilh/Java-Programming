package hw05;

public class ComputerDemo {
	public static void main(String[] args) {

		Computer notebook = new Computer();
		Computer pc = new Computer();

		notebook.setYear(2012); 
		notebook.setPrice(250);
		notebook.setOperationSystem("Windows 7 Starter"); 
		notebook.setNotebook(true);
		notebook.setHardDiskMemory(150);
		notebook.setFreeMemory(120);

		pc.setYear(2008);
		pc.setPrice(500);
		pc.setOperationSystem("Windows 7 Ultimate");
		pc.setNotebook(false);
		pc.setHardDiskMemory(700);
		pc.setFreeMemory(410);

		pc.useMemory(100);
		notebook.changeOperationSystem("Windows 8");

		System.out.println("I bought my notebook in " + notebook.getYear()
				+ " year for " + notebook.getPrice() + " leva. It's working under "
				+ notebook.getOperationSystem() + ", " + notebook.getHardDiskMemory()
				+ " GB hard disk and " + notebook.getFreeMemory()
				+ " GB free space.");
		
		System.out.println("I bought my pc in " + pc.getYear() + " year for "
				+ pc.getPrice() + " leva. It's working under " + pc.getOperationSystem()
				+ ", " + pc.getHardDiskMemory() + " GB hard disk and "
				+ pc.getFreeMemory() + " GB free space.");
	}

}

package lesson08;

public class AllWork {
	
	private static final int NUMBER_OF_TASKS=10; // TAKA DEFINIRAME CONSTANTI :)
	
	private Task[] tasks;
	private int freePlacesForTasks;
	int CurrentUnassignedTask;
	
	AllWork(){
		tasks=new Task[NUMBER_OF_TASKS];
		freePlacesForTasks=NUMBER_OF_TASKS;
		CurrentUnassignedTask=0;
	}
	
	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	public int getCurrentUnassignedTask() {
		return CurrentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		CurrentUnassignedTask = currentUnassignedTask;
	}

	public void addTask(Task taskToAdd){
		if(taskToAdd==null){
			System.out.println("No task to add!");
			return;
		}
		if(freePlacesForTasks<=0){
			System.out.println("No free places for new task!");
			return;
		}
		else {
		for(int i=0;i<this.tasks.length;i++){
			if(this.tasks[i]==null){
				this.tasks[i]=taskToAdd;
				this.freePlacesForTasks--;
//				this.CurrentUnassignedTask++;  
				return;
			}
		}
		}	
	}
				


	
	public Task getNextTask(){
		if( this.CurrentUnassignedTask>=this.tasks.length){
			System.out.println("No free tasks to get");
			return null;
		}
		else{
			return this.tasks[CurrentUnassignedTask++];
//		CurrentUnassignedTask++;
//		return this.tasks[CurrentUnassignedTask-1];
	
	}
	}

	public boolean isAllWorkDone(){
		
		//boolean isAllWorkDone=true;
		for(int i=0;i<tasks.length;i++){
			if(tasks[i].getWorkingHours()!=0){
				return false;
//				isAllWorkDone=false;
//				break;
			}
		}
		return true;
	}
}

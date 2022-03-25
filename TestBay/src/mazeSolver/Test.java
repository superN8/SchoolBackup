package mazeSolver;

public class Test {

	public static void main(String[] args) 
	{
		Generator gen = new Generator();
		Solver maze1 = new Solver(),
			   maze2 = new Solver(20,20),
			   maze3 = new Solver(gen.generateMaze()),
			   maze4 = new Solver("F:\\MBR2TB\\eclipse workspace\\TestBay\\src\\mazeSolver\\maze.txt");
		while(!maze1.isSolvable())
		{
			maze1 = new Solver();
		}
		while(!maze2.isSolvable())
		{
			maze2 = new Solver(20,20);
		}
		while(!maze3.isSolvable())
		{
			maze3 = new Solver(gen.generateMaze());
		}
		System.out.println("Maze 1 is solvable: " + maze1.isSolvable());
		System.out.println("Maze 2 is solvable: " + maze2.isSolvable());
		System.out.println("Maze 3 is solvable: " + maze3.isSolvable());
		System.out.println("Maze 4 is solvable: " + maze4.isSolvable());
		System.out.println(maze2.toString());
		System.out.println(maze2.solvedString());
	}

}

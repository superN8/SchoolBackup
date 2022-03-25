package mazeSolver;

public class Generator 
{
	public int[][] generateMaze()
	{
		int[][] maze = new int[(int)(Math.random()*20+5)][(int)(Math.random()*20+5)];
		for(int y = 0; y < maze[0].length; y++)
		{
			for(int x = 0; x < maze.length; x++)
			{
				maze[x][y] = (int)(Math.random()*2);
			}
		}
		return maze;
	}
}

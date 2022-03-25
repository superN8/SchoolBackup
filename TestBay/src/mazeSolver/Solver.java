package mazeSolver;

import java.io.*;
import java.util.Scanner;

public class Solver 
{
	private int[][] point = new int[1][1];
	private boolean solvable = false;
	private final int path = 1,
					  wall = 0,
					  target = 2;
	
	public Solver()
	{
		point = generateMaze(1,1);
		checkRoute(0,0);;
	}
	
	public Solver(int w, int h)
	{
		point = generateMaze(w,h);
		checkRoute(0,0);
	}
	
	public Solver(int[][] maze)
	{
		point = maze;
		checkRoute(0,0);
	}
	
	public Solver(String path)
	{
		scanMaze(path);
		checkRoute(0,0);
	}
	
	private int[][] generateMaze(int w, int h)
	{
		int[][] maze = new int[w][h];
		for(int y = 0; y < maze[0].length; y++)
		{
			for(int x = 0; x < maze.length; x++)
			{
				if((int)(Math.random()*2) == 0)
					maze[x][y] = wall;
				else
					maze[x][y] = path;
			}
		}
		return maze;
	}	
	
	private int[][] scanMaze(String path)
	{
		try
		{
			int width = 0,
			    height = 0;
			Scanner maze = new Scanner(new FileReader(path));
			while(maze.hasNextLine())
			{
				height++;
				
				if(height > point[0].length)
				{
					point = expandY(point);
				}
				
				width=0;
				Scanner gap = new Scanner(maze.nextLine());
				
				while(gap.hasNextInt())
				{
					width++;
					if(width > point.length)
					{
						point=expandX(point);
					}
					point[width-1][height-1] = gap.nextInt();					
				}
				
				gap.close();
					
			}
				
			maze.close();
		}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		return point;
	}
	
	private int[][] expandX(int[][] matrix)
	{
		int[][] temp = new int[matrix.length+1][matrix[0].length];
	 
		for(int y = 0; y < matrix[0].length; y++)
		{
			for(int x = 0; x < matrix.length; x++)
			{
				temp[x][y] = matrix[x][y];
			}
		}
		 
		return temp;
	}
	 
	private int[][] expandY(int[][] matrix)
	{
		int[][] temp = new int[matrix.length][matrix[0].length+1];
	 
		for(int y = 0; y < matrix[0].length; y++)
		{
			for(int x = 0; x < matrix.length; x++)
			{
				temp[x][y] = matrix[x][y];
			}
		}
		 
		return temp;
	}
	
	private void checkRoute(int x, int y)
	{
		if(point[x][y] == path && !solvable)
		{
			point[x][y] = target;
			if(x == point.length -1 && y == point[0].length - 1)
				solvable = true;
			
			if(x+1 < point.length && point[x+1][y] == path)
				checkRoute(x+1,y);
										
			if(y+1 < point[0].length && point[x][y+1] == path)
				checkRoute(x,y+1);
				
			if(x-1 >= 0 && point[x-1][y] == path)
				checkRoute(x-1,y);	
				
			if(y-1 >= 0 && point[x][y-1] == path)
				checkRoute(x,y-1);
		}
	}
	
	public boolean isSolvable()
	{
		return solvable;
	}
	
	 
	
	public String toString()
	{
		String s = "";
		for(int y = 0; y < point[0].length; y++)
		{
			for(int x = 0; x < point.length; x++)
			{
				if(point[x][y] == wall)
					s+= wall + " ";
				else
					s+= path + " ";					
			}
			s+="\n";
		}
		return s;
	}
	
	public String solvedString()
	{
		if(solvable)
		{
			String s = "";
			for(int y = 0; y < point[0].length; y++)
			{
				for(int x = 0; x < point.length; x++)
				{
					s += point[x][y] + " ";
				}
				s+="\n";
			}
			return s;
		}
		return "Maze not solvable";
	}
}
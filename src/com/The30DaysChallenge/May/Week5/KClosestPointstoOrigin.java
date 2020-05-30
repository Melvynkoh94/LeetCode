package com.The30DaysChallenge.May.Week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class KClosestPointstoOrigin {
	
	/*
	 * Input: points = [[1,3],[-2,2]], K = 1
		Output: [[-2,2]]
		Explanation: 
		The distance between (1, 3) and the origin is sqrt(10).
		The distance between (-2, 2) and the origin is sqrt(8).
		Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
		We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
	 */

	public static void main(String[] args) {

//		int[][] result = kClosest(new int[][] {{1,3},{-2,2}}, 1);
		int[][] result = kClosest(new int[][] {{3,3},{5,1},{-2,4}}, 2);
		Stream.of(result).forEach(x->System.out.println(Arrays.toString(x)));

	}
	
	// Using HashMap to store (key) index of points, and (value) distance of points
	// Using PriorityQueue to store each map entry, sorted by lowest value with highest priority
	public static int[][] kClosest(int[][] points, int K) {
		
		// Store Key:Value --> Index:Distance
		Map<Integer,Integer> map = new HashMap<>();
		
		// Use PriorityQueue data structure to return the smallest distance in queue
		// which is based on the smallest value in the key:value pair
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
				(a,b) -> a.getValue()-b.getValue());
				
		for(int i=0; i<points.length; i++) {
			int distance = (points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
			map.put(i, distance);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			pq.offer(entry);
		}
		System.out.println(pq);
		System.out.println(pq.peek());
		
		int[][] result = new int[K][2];
		for(int j=0; j<K; j++) {
			result[j] = points[pq.poll().getKey()];
		}		
		return result;			
        
    }

}

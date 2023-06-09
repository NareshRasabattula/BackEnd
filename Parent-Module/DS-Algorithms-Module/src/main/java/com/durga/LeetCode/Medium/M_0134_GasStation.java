package com.durga.LeetCode.Medium;
/*
 * https://leetcode.com/problems/gas-station/
 */
public class M_0134_GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int start = 0;
		int tank = 0; // cumulated from station at start
		int total = 0; // extra fuel left at the end of a full circle
		for (int station = 0, count = gas.length; station < count; ++station) {
			int fuel = gas[station] - cost[station]; // re-fuel and drive to the next station
			tank += fuel;
			total += fuel;
			if (tank < 0) { // Ran out of gas on this circle starting from start, so
				tank = 0; // we're starting again
				start = station + 1; // from next station.
				// We already left this station when run out of gas.
				// Starting anywhere (>= 0) up to this station would be futile,
				// because we'll run out of gas somewhere before this station.
			}
		}
		return total < 0 ? -1 // cannot complete the full circle, because we would run out of gas somewhere
				: start; // something is left in the tank so the last starting point is valid
	}

	public static void main(String[] args) {
		M_0134_GasStation obj = new M_0134_GasStation();
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};

		System.out.print(obj.canCompleteCircuit(gas, cost));
	}
}

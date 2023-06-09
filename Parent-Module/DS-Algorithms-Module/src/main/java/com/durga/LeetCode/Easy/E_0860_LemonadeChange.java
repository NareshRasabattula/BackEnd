package com.durga.LeetCode.Easy;
/*
 * https://leetcode.com/problems/lemonade-change/
 */
public class E_0860_LemonadeChange {

	public boolean lemonadeChange(int[] bills) {
        int len = bills.length, count5 = 0, count10 = 0;

		for(int i = 0; i < len; i++){
            // if 5$ bill nothing to do
            if(bills[i] == 5) {
                count5++;
                continue;
            }
            // if any other bill need to see what bills we have to return
			int needToReturn = bills[i]/5 - 1;

			if(needToReturn > 1 && count10 > 0){
				needToReturn -= 2;
				count10--;
			}
			if(needToReturn > 0){
				count5 -= needToReturn;
			}
            // if we need to return more then we have
			if(count5 < 0) return false;
		
			if(bills[i] == 10) count10++;
		}
		return true;
    }
	public static void main(String[] args) {
		E_0860_LemonadeChange obj = new E_0860_LemonadeChange();
		System.out.println(obj.lemonadeChange(new int[] {5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20}));
	}
}

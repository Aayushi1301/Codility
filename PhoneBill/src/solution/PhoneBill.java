package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * returns the bill for a given invoice bill
 */
public class PhoneBill {
    public int getBill(String s){
        //Initialization
        //hashmap to store bill and duration for a given number
        Map<String, Invoice> map = new HashMap<>();
        int maxDuration = -1;
        String maxPhone=null;
        int totalBill=0;

        //separate the differnet inputs
        String inputs[] = s.split("\n");
        for(int i=0;i<inputs.length;i++){

            //separate duration and the number
            String call[] = inputs[i].split(",");
            String time = call[0];
            String phone = call[1];

            //separation of hours,minutes and seconds
            String duration[] = time.split(":");
            int hours = Integer.valueOf(duration[0]);
            int mins = Integer.valueOf(duration[1]);
            int sec = Integer.valueOf(duration[2]);

            //calculating total minutes
            int totMins = hours*60+mins;
            int bill=0;

            //calculating bill based on minute
            if(totMins<5){
                bill = (totMins*60+sec)*3;
            }
            else{
                if(sec>0){
                    bill = (totMins+1)*150;
                }else{
                    bill = totMins*150;
                }
            }

            //call duration in seconds
            int callDuration = hours*3600+mins*60+sec;

            //calculation of bill
            Invoice inv = new Invoice();
            inv.billAmount = bill;
            inv.totalDuration = callDuration;
            Invoice invoice = map.get(phone);
            if(invoice!=null){
                invoice.billAmount+=bill;
                invoice.totalDuration+=callDuration;
            }else{
                map.put(phone,inv);
            }

        }

        //find number which is called maximum number of times and remove it from the map
        for(String phone:map.keySet()){
            if(map.get(phone).totalDuration>maxDuration){
                maxDuration = map.get(phone).totalDuration;
                maxPhone = phone;
            }
        }
        map.remove(maxPhone);

        //calculation of total bill
        for(String phone:map.keySet()){
            totalBill += map.get(phone).billAmount;
        }
        return totalBill;
    }

}

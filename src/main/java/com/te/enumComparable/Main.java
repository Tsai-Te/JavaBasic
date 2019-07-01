//package com.te.enumComparable;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Main {
//    public enum Day implements Comparable<Day> {
//        MON("Monday",1), TUE("TUESDAY", 2), WED("WEDNESDAY", 3), THU(
//                "THURSDAY", 4), FRI("FRIDAY", 5), SAT("SATURDAY", 6), SUN(
//                "SUNDAY", 0);
//
//        private String name;
//        private int index;
//
//        Day(String name, int index){
//            this.name=name;
//            this.index=index;
//        }
//
//        public String getName(){
//            return name;
//        }
//
//        public int getIndex(){
//            return index;
//        }
//    }
//
//    public static void sortDates (final List<Day> dayList){
//        final Set<Day> set = new TreeSet<Day>();
//        set.addAll(dayList);
//        for (final Day day : set){
//            System.out.println(day);
//        }
//    }
//
//    public static void main(final String[] args){
//        sortDates(Arrays.asList(new Day[]{
//                Day.MON, Day.TUE, Day.WED, Day.THU, Day.FRI, Day.SAT, Day.SUN
//        }));
//    }
//
//    public class DAYComparator implements Comparable<Day> {
//        @Override
//        public int compareTo(final Day o1, final Day o2) {
//            int returnValue=0;
//            if (o1.getIndex()>o2.getIndex()) {
//                return 1;
//            } else if (o1.getIndex() < o2.getIndex()){
//                return -1;
//            }
//            return returnValue;
//        }
//
//    }
//}

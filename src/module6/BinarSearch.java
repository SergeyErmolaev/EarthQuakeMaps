//package module6;
//
//public class BinarSearch {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static String findAirportCode(String toFind, String[] airports) {
//		int low = 0;
//		int high = airports.length - 1;
//		int mid;
//		while (low <= high) {
//			mid = low + (high - low) / 2;
//			int compare = toFind.compareTo(airports[mid].getCity());
//			if (compare < 0) {
//				high = mid - 1;
//			} else if (compare > 0) {
//				low = mid + 1;
//			} else {
//				return airports[mid];
//			}
//		}
//		return null;
//	}
//}

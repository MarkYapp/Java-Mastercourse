package section8;

import java.util.LinkedList;
import java.util.ListIterator;

public class CountriesLinkedList {
  public static void main(String[] args) {
    LinkedList<String> countries = new LinkedList<>();
    arrangeCountries(countries, "New Zealand");
    arrangeCountries(countries, "Albania");
    arrangeCountries(countries, "Fiji");
    arrangeCountries(countries, "Russia");
    printList(countries);
  }

  private static boolean arrangeCountries(LinkedList<String> linkedList, String country) {
    ListIterator<String> listIterator =  linkedList.listIterator();

    while(listIterator.hasNext()) {
    int comparison = listIterator.next().compareTo(country);

      if (comparison == 0) {
        System.out.println("Country already exists");
          return false;
      } else if (comparison > 0) {
        listIterator.previous();
        listIterator.add(country);
        System.out.println(country + " was added at index " + (listIterator.nextIndex() - 1));
        return true;
      }
    }
    System.out.println(country + " was added at index " + listIterator.nextIndex());
    listIterator.add(country);
    return true;
  }

  private static void printList(LinkedList<String> linkedList) {
    System.out.println("========================\nCountries in alphabetical order:");
    ListIterator iterator = linkedList.listIterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

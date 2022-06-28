package com.anurag.interview;

 class Hotel {

   public int bookings;
   public void book() {
               bookings++;
               }
   }

    class SuperHotel extends Hotel {
   public void book() {
              bookings--;
              }
  public void book(int size) {
              book();
              super.book();
              bookings += size;
              }
  public static void main(String args[]) {
              Hotel hotel = new Hotel();
              hotel.book();
              System.out.print(hotel.bookings);
              }
}


package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Apple[] appleProducts={createObject("MacBook"),createObject("Ipad"), createObject("Iphone")};
      for (Apple a : appleProducts){
          a.print();
      }
    }
    public static Apple createObject(String className){
        switch (className){
            case "MacBook":
                MacBook macBook=new MacBook("Air",2017, 16.5);
                return macBook;
            case "Ipad":
                Ipad ipad=new Ipad( "mini", 2020, true);
                return ipad;
            case
                    "Iphone":
                Iphone iphone=new Iphone( "11pro",2020, "black");
            return iphone;

        }

        return null;
    }
}

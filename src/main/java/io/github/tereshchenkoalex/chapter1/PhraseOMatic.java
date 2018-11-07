package io.github.tereshchenkoalex.chapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front- end", "web-based", "pervasive", "smart", "six- sigma", "critical-path", "dynamic" };
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int oneLength = wordListOne.length;
        System.out.println("Size of array wordListOne is " + oneLength);
        int twoLength = wordListTwo.length;
        System.out.println("Size of array wordListTwo is " + twoLength);
        int threeLength = wordListThree.length;
        System.out.println("Size of array wordListThree is " + threeLength);

        int rand1 = (int) (Math.random() * oneLength);
        System.out.println("Math random is " + Math.random());
        System.out.println("rand1 is " + rand1);
        int rand2 = (int) (Math.random() * twoLength);
        System.out.println("Math random is " + Math.random());
        System.out.println("rand2 is " + rand2);
        int rand3 = (int) (Math.random() * threeLength);
        System.out.println("Math random is " + Math.random());
        System.out.println("rand3 is " + rand3);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}

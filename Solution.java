package suanfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: Solution
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 16:21
 * @Version 1.0
 *
 */


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> testCases = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            testCases.add(scanner.nextInt());
        }

        List<Item> items = generateItems();

        for (int n : testCases) {
            decomposeNumber(n, items);
        }
    }

    private static List<Item> generateItems() {
        List<Item> items = new ArrayList<>();
        // Generate all possible terms 2^a * 3^b
        for (int a = 0; ; a++) {
            for (int b = 0; ; b++) {
                long value = (long) Math.pow(2, a) * (long) Math.pow(3, b);
                if (value > 1e9) {
                    break;
                }
                items.add(new Item(a, b, value));
            }
            if (Math.pow(2, a) > 1e9) {
                break;
            }
        }
        // Sort items in descending order based on value
        Collections.sort(items, (i1, i2) -> Long.compare(i2.value, i1.value));
        return items;
    }

    private static void decomposeNumber(int n, List<Item> items) {
        List<Long> results = new ArrayList<>();

        for (Item item : items) {
            if (n >= item.value) {
                n -= item.value;
                results.add(item.value);
            }
        }

        System.out.println(results.size());
        for (int i = 0; i < results.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(results.get(i));
        }
        System.out.println();
    }

    static class Item {
        int a;
        int b;
        long value;

        Item(int a, int b, long value) {
            this.a = a;
            this.b = b;
            this.value = value;
        }
    }
}
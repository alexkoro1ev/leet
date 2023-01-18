package easy.merge_two_sorted_lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode root = head;

        // До тех пор, пока не дойдем до конца обоих листнодов
        while (list1 != null && list2 != null) {
            // сравниваем значения текущих нодов, выбираем меньшее
            if (list1.val <= list2.val) {
                // ставим его следующим за корнем
                head.next = list1;
                // переходим к следующей ноде в листе
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            // объявляем башкой следующую ноду
            head = head.next;
        }

        // скидываем в хвост остатки нод
        head.next = list1 != null ? list1 : list2;

        // возвращаем листнод, кроме нулевого элемента
        return root.next;
    }
}

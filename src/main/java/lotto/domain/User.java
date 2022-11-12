package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class User {
    public static List<List<Integer>> numbers = new ArrayList<>();
    private int bonusNum;

    public static List<List<Integer>> randomLotto(int price) {

        for (int i=0; i<price; i++) {
            List<Integer> nums = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            nums.sort(Comparator.naturalOrder());
            numbers.add(nums);
        }

        return numbers;
    }

    public void setBonusNum(int bonusNum) {
        this.bonusNum = bonusNum;
    }

    public int getBonusNum() {
        return bonusNum;
    }
}

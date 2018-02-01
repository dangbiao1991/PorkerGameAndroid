package com.yunke.xiaovo.bean;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class DDZPorker extends Porker implements Comparable<DDZPorker> {

    public static final int TWO_SIZE = 12;
    public static final int SMALL_KING_SIZE = 13;
    public static final int BIG_KING_SIZE = 14;
    public int porkerSize;
    public boolean isClick;


    @Override
    public int compareTo(@NonNull DDZPorker ddzPorker) {
        int temp2 = this.porkerSize;
        int temp1 = ddzPorker.porkerSize;
        int sort = temp1 - temp2;
        return sort == 0 ?
                this.porkerType - ddzPorker.porkerType : sort;
    }

    @Override
    public String getSizeStr() {
        return getSizeStr(porkerSize);
    }

    public static String getSizeStr(int porkerSize) {
        String str;
        if (porkerSize == TWO_SIZE) {
            str = "2";
        } else if (porkerSize == SMALL_KING_SIZE) {
            str = "小王";
        } else if (porkerSize == BIG_KING_SIZE) {
            str = "大王";
        } else if (porkerSize == 11) {
            str = "A";
        } else if (porkerSize + 3 == 13) {
            str = "K";
        } else if (porkerSize + 3 == 12) {
            str = "Q";
        } else if (porkerSize + 3 == 11) {
            str = "J";
        } else {
            str = porkerSize + 3 + "";
        }
        return str;
    }
}
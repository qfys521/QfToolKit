package cn.qfys521.Utils.DateUtil;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * 获取当前日期是星期几<br>
     *
     * @return 当前日期是星期几
     */
    public int getWeekOfDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int weekIdx = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        switch (weekIdx) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 7;
        }
    }

}

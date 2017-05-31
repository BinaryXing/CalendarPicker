package com.xing.android.calendarpicker.model;

/**
 * 连选Model
 * Created by zhaoxx on 16/3/29.
 */
public class ContinuousSelectItem<T> {
    public DayCell<T> mStartDayCell;
    public DayCell<T> mEndDayCell;

    public ContinuousSelectItem<T> getCopyContinuousSelectItem() {
        ContinuousSelectItem<T> item = new ContinuousSelectItem<T>();
        if(mStartDayCell != null) {
            item.mStartDayCell = mStartDayCell.getCopyDayCell();
        }
        if(mEndDayCell != null) {
            item.mEndDayCell = mEndDayCell.getCopyDayCell();
        }
        return item;
    }
}

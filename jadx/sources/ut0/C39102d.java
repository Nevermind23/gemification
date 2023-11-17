package ut0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StatusDetailsApiModel;
import yt0.C40063d;

/* renamed from: ut0.d */
public final class C39102d {
    /* renamed from: a */
    public final C40063d mo92773a(StatusDetailsApiModel statusDetailsApiModel) {
        long j;
        String str;
        String str2;
        int i;
        long j2;
        long j3;
        String str3;
        String str4;
        int i2;
        long j4;
        long j5;
        C41536l.m120489i(statusDetailsApiModel, "details");
        Long clientKey = statusDetailsApiModel.getClientKey();
        if (clientKey != null) {
            j = clientKey.longValue();
        } else {
            j = 0;
        }
        String currentLabelType = statusDetailsApiModel.getCurrentLabelType();
        if (currentLabelType == null) {
            str = "";
        } else {
            str = currentLabelType;
        }
        String currentLabel = statusDetailsApiModel.getCurrentLabel();
        if (currentLabel == null) {
            str2 = "";
        } else {
            str2 = currentLabel;
        }
        Integer sumStatusPoint = statusDetailsApiModel.getSumStatusPoint();
        if (sumStatusPoint != null) {
            i = sumStatusPoint.intValue();
        } else {
            i = 0;
        }
        Long startDate = statusDetailsApiModel.getStartDate();
        if (startDate != null) {
            j2 = startDate.longValue();
        } else {
            j2 = 0;
        }
        Long endDate = statusDetailsApiModel.getEndDate();
        if (endDate != null) {
            j3 = endDate.longValue();
        } else {
            j3 = 0;
        }
        String realLabelType = statusDetailsApiModel.getRealLabelType();
        if (realLabelType == null) {
            str3 = "";
        } else {
            str3 = realLabelType;
        }
        String realLabel = statusDetailsApiModel.getRealLabel();
        if (realLabel == null) {
            str4 = "";
        } else {
            str4 = realLabel;
        }
        String nextLabelType = statusDetailsApiModel.getNextLabelType();
        String nextLabel = statusDetailsApiModel.getNextLabel();
        Integer nextLabelScore = statusDetailsApiModel.getNextLabelScore();
        if (nextLabelScore != null) {
            i2 = nextLabelScore.intValue();
        } else {
            i2 = 0;
        }
        Long nextStartDate = statusDetailsApiModel.getNextStartDate();
        if (nextStartDate != null) {
            j4 = nextStartDate.longValue();
        } else {
            j4 = 0;
        }
        Long nextEndDate = statusDetailsApiModel.getNextEndDate();
        if (nextEndDate != null) {
            j5 = nextEndDate.longValue();
        } else {
            j5 = 0;
        }
        return new C40063d(j, str, str2, i, j2, j3, str3, str4, nextLabelType, nextLabel, i2, j4, j5, statusDetailsApiModel.getDetailsUrl());
    }
}

package p921vr;

import android.util.Base64;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.contactus.data.model.SoloBankerInfoApiEntity;
import p932wr.C29566a;

/* renamed from: vr.a */
public final class C29155a {
    /* renamed from: a */
    public final C29566a mo69004a(SoloBankerInfoApiEntity soloBankerInfoApiEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C41536l.m120489i(soloBankerInfoApiEntity, "data");
        String str9 = soloBankerInfoApiEntity.getFirstNameEn() + " " + soloBankerInfoApiEntity.getLastNameEn();
        String str10 = soloBankerInfoApiEntity.getFirstName() + " " + soloBankerInfoApiEntity.getLastName();
        String phone = soloBankerInfoApiEntity.getPhone();
        if (phone == null) {
            str = "";
        } else {
            str = phone;
        }
        String email = soloBankerInfoApiEntity.getEmail();
        if (email == null) {
            str2 = "";
        } else {
            str2 = email;
        }
        byte[] decode = Base64.decode(soloBankerInfoApiEntity.getUserPhoto(), 0);
        C41536l.m120488h(decode, "decode(userPhoto, Base64.DEFAULT)");
        String bankerType = soloBankerInfoApiEntity.getBankerType();
        if (bankerType == null) {
            str3 = "";
        } else {
            str3 = bankerType;
        }
        String bankerContactKey = soloBankerInfoApiEntity.getBankerContactKey();
        if (bankerContactKey == null) {
            str4 = "";
        } else {
            str4 = bankerContactKey;
        }
        String bankerContactValue = soloBankerInfoApiEntity.getBankerContactValue();
        if (bankerContactValue == null) {
            str5 = "";
        } else {
            str5 = bankerContactValue;
        }
        String bankerSloganKey = soloBankerInfoApiEntity.getBankerSloganKey();
        if (bankerSloganKey == null) {
            str6 = "";
        } else {
            str6 = bankerSloganKey;
        }
        String bankerSloganValue = soloBankerInfoApiEntity.getBankerSloganValue();
        if (bankerSloganValue == null) {
            str7 = "";
        } else {
            str7 = bankerSloganValue;
        }
        String bankerTitleKey = soloBankerInfoApiEntity.getBankerTitleKey();
        if (bankerTitleKey == null) {
            str8 = "";
        } else {
            str8 = bankerTitleKey;
        }
        String bankerTitleValue = soloBankerInfoApiEntity.getBankerTitleValue();
        if (bankerTitleValue == null) {
            bankerTitleValue = "";
        }
        return new C29566a(str9, str10, str, str2, decode, str3, str4, str5, str6, str7, str8, bankerTitleValue);
    }
}

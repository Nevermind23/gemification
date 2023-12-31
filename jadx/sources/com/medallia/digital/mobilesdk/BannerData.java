package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

public class BannerData implements Serializable {
    private static final int HASH_CODE_MULT = 31;
    private String acceptButtonBackgroundColor;
    private String acceptButtonText;
    private String acceptButtonTextColor;
    private String backgroundColor;
    private String buttonsDisplay;
    private String closeButtonColor;
    private String font;
    private String handleTextColor;
    private String invitationBody;
    private String invitationTimeout;
    private String invitationTitle;
    private String isPartial;
    private String isSticky;
    private String position;
    private String textColor;
    private String themeName;

    BannerData(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "selectedTheme";
        String str2 = "isPartial";
        try {
            if (jSONObject2.has("invitationTitle") && !jSONObject2.isNull("invitationTitle")) {
                this.invitationTitle = jSONObject2.getString("invitationTitle");
            }
            if (jSONObject2.has("invitationBody") && !jSONObject2.isNull("invitationBody")) {
                this.invitationBody = jSONObject2.getString("invitationBody");
            }
            if (jSONObject2.has("textColor") && !jSONObject2.isNull("textColor")) {
                this.textColor = jSONObject2.getString("textColor");
            }
            if (jSONObject2.has("handleTextColor") && !jSONObject2.isNull("handleTextColor")) {
                this.handleTextColor = jSONObject2.getString("handleTextColor");
            }
            if (jSONObject2.has("backgroundColor") && !jSONObject2.isNull("backgroundColor")) {
                this.backgroundColor = jSONObject2.getString("backgroundColor");
            }
            if (jSONObject2.has("font") && !jSONObject2.isNull("font")) {
                this.font = jSONObject2.getString("font");
            }
            if (jSONObject2.has("position") && !jSONObject2.isNull("position")) {
                this.position = jSONObject2.getString("position");
            }
            if (jSONObject2.has("invitationTimeout") && !jSONObject2.isNull("invitationTimeout")) {
                this.invitationTimeout = jSONObject2.getString("invitationTimeout");
            }
            if (jSONObject2.has("buttonsDisplay") && !jSONObject2.isNull("buttonsDisplay")) {
                this.buttonsDisplay = jSONObject2.getString("buttonsDisplay");
            }
            if (jSONObject2.has("acceptButtonText") && !jSONObject2.isNull("acceptButtonText")) {
                this.acceptButtonText = jSONObject2.getString("acceptButtonText");
            }
            if (jSONObject2.has("acceptButtonTextColor") && !jSONObject2.isNull("acceptButtonTextColor")) {
                this.acceptButtonTextColor = jSONObject2.getString("acceptButtonTextColor");
            }
            if (jSONObject2.has("acceptButtonBackgroundColor") && !jSONObject2.isNull("acceptButtonBackgroundColor")) {
                this.acceptButtonBackgroundColor = jSONObject2.getString("acceptButtonBackgroundColor");
            }
            if (jSONObject2.has("closeButtonColor") && !jSONObject2.isNull("closeButtonColor")) {
                this.closeButtonColor = jSONObject2.getString("closeButtonColor");
            }
            if (jSONObject2.has("isSticky") && !jSONObject2.isNull("isSticky")) {
                this.isSticky = jSONObject2.getString("isSticky");
            }
            String str3 = str2;
            if (jSONObject2.has(str3) && !jSONObject2.isNull(str3)) {
                this.isPartial = jSONObject2.getString(str3);
            }
            String str4 = str;
            if (jSONObject2.has(str4) && !jSONObject2.isNull(str4)) {
                this.themeName = jSONObject2.getString(str4);
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerData bannerData = (BannerData) obj;
        String str = this.invitationTitle;
        if (str == null ? bannerData.invitationTitle != null : !str.equals(bannerData.invitationTitle)) {
            return false;
        }
        String str2 = this.invitationBody;
        if (str2 == null ? bannerData.invitationBody != null : !str2.equals(bannerData.invitationBody)) {
            return false;
        }
        String str3 = this.textColor;
        if (str3 == null ? bannerData.textColor != null : !str3.equals(bannerData.textColor)) {
            return false;
        }
        String str4 = this.handleTextColor;
        if (str4 == null ? bannerData.handleTextColor != null : !str4.equals(bannerData.handleTextColor)) {
            return false;
        }
        String str5 = this.backgroundColor;
        if (str5 == null ? bannerData.backgroundColor != null : !str5.equals(bannerData.backgroundColor)) {
            return false;
        }
        String str6 = this.font;
        if (str6 == null ? bannerData.font != null : !str6.equals(bannerData.font)) {
            return false;
        }
        String str7 = this.position;
        if (str7 == null ? bannerData.position != null : !str7.equals(bannerData.position)) {
            return false;
        }
        String str8 = this.buttonsDisplay;
        if (str8 == null ? bannerData.buttonsDisplay != null : !str8.equals(bannerData.buttonsDisplay)) {
            return false;
        }
        String str9 = this.acceptButtonText;
        if (str9 == null ? bannerData.acceptButtonText != null : !str9.equals(bannerData.acceptButtonText)) {
            return false;
        }
        String str10 = this.acceptButtonBackgroundColor;
        if (str10 == null ? bannerData.acceptButtonBackgroundColor != null : !str10.equals(bannerData.acceptButtonBackgroundColor)) {
            return false;
        }
        String str11 = this.acceptButtonTextColor;
        if (str11 == null ? bannerData.acceptButtonTextColor != null : !str11.equals(bannerData.acceptButtonTextColor)) {
            return false;
        }
        String str12 = this.closeButtonColor;
        if (str12 == null ? bannerData.closeButtonColor != null : !str12.equals(bannerData.closeButtonColor)) {
            return false;
        }
        String str13 = this.isSticky;
        if (str13 == null ? bannerData.isSticky != null : !str13.equals(bannerData.isSticky)) {
            return false;
        }
        String str14 = this.isPartial;
        if (str14 == null ? bannerData.isPartial != null : !str14.equals(bannerData.isPartial)) {
            return false;
        }
        String str15 = this.themeName;
        if (str15 == null ? bannerData.themeName != null : !str15.equals(bannerData.themeName)) {
            return false;
        }
        String str16 = this.invitationTimeout;
        String str17 = bannerData.invitationTimeout;
        return str16 != null ? str16.equals(str17) : str17 == null;
    }

    /* access modifiers changed from: protected */
    public String getAcceptButtonBackgroundColor() {
        return this.acceptButtonBackgroundColor;
    }

    /* access modifiers changed from: protected */
    public String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    /* access modifiers changed from: protected */
    public String getAcceptButtonTextColor() {
        return this.acceptButtonTextColor;
    }

    /* access modifiers changed from: protected */
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* access modifiers changed from: protected */
    public String getCloseButtonColor() {
        return this.closeButtonColor;
    }

    /* access modifiers changed from: protected */
    public String getFont() {
        return this.font;
    }

    /* access modifiers changed from: protected */
    public String getHandleTextColor() {
        return this.handleTextColor;
    }

    /* access modifiers changed from: protected */
    public String getInvitationBody() {
        return this.invitationBody;
    }

    /* access modifiers changed from: protected */
    public Long getInvitationTimeout() {
        String str = this.invitationTimeout;
        return Long.valueOf(str != null ? Long.parseLong(str) : 0);
    }

    /* access modifiers changed from: protected */
    public String getInvitationTitle() {
        return this.invitationTitle;
    }

    public String getPosition() {
        return this.position;
    }

    /* access modifiers changed from: protected */
    public String getTextColor() {
        return this.textColor;
    }

    public String getThemeName() {
        return this.themeName;
    }

    public int hashCode() {
        String str = this.invitationTitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.invitationBody;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.handleTextColor;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.font;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.position;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.invitationTimeout;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.buttonsDisplay;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.acceptButtonText;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.acceptButtonTextColor;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.acceptButtonBackgroundColor;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.closeButtonColor;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.isSticky;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.isPartial;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.themeName;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return hashCode15 + i;
    }

    /* access modifiers changed from: protected */
    public boolean isButtonsDisplay() {
        if (TextUtils.isEmpty(this.buttonsDisplay)) {
            return false;
        }
        return Boolean.parseBoolean(this.buttonsDisplay);
    }

    /* access modifiers changed from: protected */
    public boolean isPartial() {
        if (TextUtils.isEmpty(this.isPartial)) {
            return false;
        }
        return Boolean.parseBoolean(this.isPartial);
    }

    /* access modifiers changed from: protected */
    public boolean isSticky() {
        if (TextUtils.isEmpty(this.isSticky)) {
            return false;
        }
        return Boolean.parseBoolean(this.isSticky);
    }

    public String toJsonString() {
        try {
            return "{\"invitationTitle\":" + C11051p3.m40519d(this.invitationTitle) + ",\"invitationBody\":" + C11051p3.m40519d(this.invitationBody) + ",\"textColor\":" + C11051p3.m40518c(this.textColor) + ",\"handleTextColor\":" + C11051p3.m40518c(this.handleTextColor) + ",\"backgroundColor\":" + C11051p3.m40518c(this.backgroundColor) + ",\"font\":" + C11051p3.m40518c(this.font) + ",\"position\":" + C11051p3.m40518c(this.position) + ",\"invitationTimeout\":" + C11051p3.m40518c(this.invitationTimeout) + ",\"buttonsDisplay\":" + C11051p3.m40518c(this.buttonsDisplay) + ",\"acceptButtonText\":" + C11051p3.m40518c(this.acceptButtonText) + ",\"acceptButtonTextColor\":" + C11051p3.m40518c(this.acceptButtonTextColor) + ",\"acceptButtonBackgroundColor\":" + C11051p3.m40518c(this.acceptButtonBackgroundColor) + ",\"closeButtonColor\":" + C11051p3.m40518c(this.closeButtonColor) + ",\"isSticky\":" + C11051p3.m40518c(this.isSticky) + ",\"isPartial\":" + C11051p3.m40518c(this.isPartial) + ",\"selectedTheme\":" + C11051p3.m40518c(this.themeName) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}

package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p190o1.C7397t;

@MCKeep
public final class InAppMessage implements Parcelable {
    public static final Parcelable.Creator<InAppMessage> CREATOR = new C11631a();
    private final String activityInstanceId;
    private final String backgroundColor;
    private final TextField body;
    private final String borderColor;
    private final Size borderWidth;
    private final ButtonConfig buttonConfiguration;
    private final List<Button> buttons;
    private final CloseButton closeButton;
    private final Size cornerRadius;
    private final long displayDuration;
    private final int displayLimit;
    private final boolean displayLimitOverride;
    private final Date endDateUtc;

    /* renamed from: id */
    private final String f33732id;
    private final LayoutOrder layoutOrder;
    private final Media media;
    private final int messageDelaySec;
    private final Date modifiedDateUtc;
    private final int priority;
    private final Date startDateUtc;
    private final TextField title;
    private final Type type;
    private final String windowColor;

    @MCKeep
    public enum Alignment {
        beginning,
        center,
        end
    }

    @MCKeep
    public static final class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new C11626a();
        private final String action;
        private final ActionType actionType;
        private final String backgroundColor;
        private final String borderColor;
        private final Size borderWidth;
        private final Size cornerRadius;
        private final String fontColor;
        private final Size fontSize;

        /* renamed from: id */
        private final String f33733id;
        private final int index;
        private final String text;

        @MCKeep
        public enum ActionType {
            close,
            url,
            pushSettings,
            locationSettings
        }

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$a */
        public static final class C11626a implements Parcelable.Creator<Button> {
            /* renamed from: a */
            public final Button createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readInt(), parcel.readString(), ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), Size.valueOf(parcel.readString()));
            }

            /* renamed from: a */
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String str, int i, String str2, ActionType actionType2, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3) {
            C41536l.m120489i(str, "id");
            C41536l.m120489i(str2, "text");
            C41536l.m120489i(actionType2, "actionType");
            C41536l.m120489i(size, "fontSize");
            C41536l.m120489i(size2, "borderWidth");
            C41536l.m120489i(size3, "cornerRadius");
            this.f33733id = str;
            this.index = i;
            this.text = str2;
            this.actionType = actionType2;
            this.action = str3;
            this.fontColor = str4;
            this.fontSize = size;
            this.backgroundColor = str5;
            this.borderColor = str6;
            this.borderWidth = size2;
            this.cornerRadius = size3;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, int i, String str2, ActionType actionType2, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3, int i2, Object obj) {
            Button button2 = button;
            int i3 = i2;
            return button.copy((i3 & 1) != 0 ? button2.f33733id : str, (i3 & 2) != 0 ? button2.index : i, (i3 & 4) != 0 ? button2.text : str2, (i3 & 8) != 0 ? button2.actionType : actionType2, (i3 & 16) != 0 ? button2.action : str3, (i3 & 32) != 0 ? button2.fontColor : str4, (i3 & 64) != 0 ? button2.fontSize : size, (i3 & 128) != 0 ? button2.backgroundColor : str5, (i3 & C11398b.f33139r) != 0 ? button2.borderColor : str6, (i3 & C11398b.f33140s) != 0 ? button2.borderWidth : size2, (i3 & C11398b.f33141t) != 0 ? button2.cornerRadius : size3);
        }

        /* renamed from: -deprecated_action  reason: not valid java name */
        public final String m124933deprecated_action() {
            return this.action;
        }

        /* renamed from: -deprecated_actionType  reason: not valid java name */
        public final ActionType m124934deprecated_actionType() {
            return this.actionType;
        }

        /* renamed from: -deprecated_backgroundColor  reason: not valid java name */
        public final String m124935deprecated_backgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: -deprecated_borderColor  reason: not valid java name */
        public final String m124936deprecated_borderColor() {
            return this.borderColor;
        }

        /* renamed from: -deprecated_borderWidth  reason: not valid java name */
        public final Size m124937deprecated_borderWidth() {
            return this.borderWidth;
        }

        /* renamed from: -deprecated_cornerRadius  reason: not valid java name */
        public final Size m124938deprecated_cornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: -deprecated_fontColor  reason: not valid java name */
        public final String m124939deprecated_fontColor() {
            return this.fontColor;
        }

        /* renamed from: -deprecated_fontSize  reason: not valid java name */
        public final Size m124940deprecated_fontSize() {
            return this.fontSize;
        }

        /* renamed from: -deprecated_id  reason: not valid java name */
        public final String m124941deprecated_id() {
            return this.f33733id;
        }

        /* renamed from: -deprecated_index  reason: not valid java name */
        public final int m124942deprecated_index() {
            return this.index;
        }

        /* renamed from: -deprecated_text  reason: not valid java name */
        public final String m124943deprecated_text() {
            return this.text;
        }

        /* renamed from: -toJson  reason: not valid java name */
        public final JSONObject m124944toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", mo30569id());
            jSONObject.put("index", index());
            jSONObject.put("text", text());
            jSONObject.put("actionType", actionType().name());
            if (action() != null) {
                jSONObject.put("actionAndroid", action());
            }
            if (fontColor() != null) {
                jSONObject.put("fontColor", fontColor());
            }
            jSONObject.put("fontSize", fontSize().name());
            if (backgroundColor() != null) {
                jSONObject.put("backgroundColor", backgroundColor());
            }
            if (borderColor() != null) {
                jSONObject.put("borderColor", borderColor());
            }
            jSONObject.put("borderWidth", borderWidth().name());
            jSONObject.put("cornerRadius", cornerRadius().name());
            return jSONObject;
        }

        public final String action() {
            return this.action;
        }

        public final ActionType actionType() {
            return this.actionType;
        }

        public final String backgroundColor() {
            return this.backgroundColor;
        }

        public final String borderColor() {
            return this.borderColor;
        }

        public final Size borderWidth() {
            return this.borderWidth;
        }

        public final String component1() {
            return this.f33733id;
        }

        public final Size component10() {
            return this.borderWidth;
        }

        public final Size component11() {
            return this.cornerRadius;
        }

        public final int component2() {
            return this.index;
        }

        public final String component3() {
            return this.text;
        }

        public final ActionType component4() {
            return this.actionType;
        }

        public final String component5() {
            return this.action;
        }

        public final String component6() {
            return this.fontColor;
        }

        public final Size component7() {
            return this.fontSize;
        }

        public final String component8() {
            return this.backgroundColor;
        }

        public final String component9() {
            return this.borderColor;
        }

        public final Button copy(String str, int i, String str2, ActionType actionType2, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3) {
            C41536l.m120489i(str, "id");
            String str7 = str2;
            C41536l.m120489i(str7, "text");
            ActionType actionType3 = actionType2;
            C41536l.m120489i(actionType3, "actionType");
            Size size4 = size;
            C41536l.m120489i(size4, "fontSize");
            Size size5 = size2;
            C41536l.m120489i(size5, "borderWidth");
            Size size6 = size3;
            C41536l.m120489i(size6, "cornerRadius");
            return new Button(str, i, str7, actionType3, str3, str4, size4, str5, str6, size5, size6);
        }

        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return C41536l.m120484d(this.f33733id, button.f33733id) && this.index == button.index && C41536l.m120484d(this.text, button.text) && this.actionType == button.actionType && C41536l.m120484d(this.action, button.action) && C41536l.m120484d(this.fontColor, button.fontColor) && this.fontSize == button.fontSize && C41536l.m120484d(this.backgroundColor, button.backgroundColor) && C41536l.m120484d(this.borderColor, button.borderColor) && this.borderWidth == button.borderWidth && this.cornerRadius == button.cornerRadius;
        }

        public final String fontColor() {
            return this.fontColor;
        }

        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int hashCode = ((((((this.f33733id.hashCode() * 31) + this.index) * 31) + this.text.hashCode()) * 31) + this.actionType.hashCode()) * 31;
            String str = this.action;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fontColor;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fontSize.hashCode()) * 31;
            String str3 = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.borderColor;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return ((((hashCode4 + i) * 31) + this.borderWidth.hashCode()) * 31) + this.cornerRadius.hashCode();
        }

        /* renamed from: id */
        public final String mo30569id() {
            return this.f33733id;
        }

        public final int index() {
            return this.index;
        }

        public final String text() {
            return this.text;
        }

        public String toString() {
            return "Button(id=" + this.f33733id + ", index=" + this.index + ", text=" + this.text + ", actionType=" + this.actionType + ", action=" + this.action + ", fontColor=" + this.fontColor + ", fontSize=" + this.fontSize + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", cornerRadius=" + this.cornerRadius + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f33733id);
            parcel.writeInt(this.index);
            parcel.writeString(this.text);
            parcel.writeString(this.actionType.name());
            parcel.writeString(this.action);
            parcel.writeString(this.fontColor);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.backgroundColor);
            parcel.writeString(this.borderColor);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.cornerRadius.name());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Button(java.lang.String r15, int r16, java.lang.String r17, com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType r18, java.lang.String r19, java.lang.String r20, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r21, java.lang.String r22, java.lang.String r23, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r24, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0009
                r1 = 0
                r4 = r1
                goto L_0x000b
            L_0x0009:
                r4 = r16
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0013
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType.close
                r6 = r1
                goto L_0x0015
            L_0x0013:
                r6 = r18
            L_0x0015:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L_0x001c
                r7 = r2
                goto L_0x001e
            L_0x001c:
                r7 = r19
            L_0x001e:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0024
                r8 = r2
                goto L_0x0026
            L_0x0024:
                r8 = r20
            L_0x0026:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002e
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
                r9 = r1
                goto L_0x0030
            L_0x002e:
                r9 = r21
            L_0x0030:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0036
                r10 = r2
                goto L_0x0038
            L_0x0036:
                r10 = r22
            L_0x0038:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003e
                r11 = r2
                goto L_0x0040
            L_0x003e:
                r11 = r23
            L_0x0040:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0048
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
                r12 = r1
                goto L_0x004a
            L_0x0048:
                r12 = r24
            L_0x004a:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0052
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
                r13 = r0
                goto L_0x0054
            L_0x0052:
                r13 = r25
            L_0x0054:
                r2 = r14
                r3 = r15
                r5 = r17
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.<init>(java.lang.String, int, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType, java.lang.String, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, java.lang.String, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @MCKeep
    public enum ButtonConfig {
        stacked,
        twoUp
    }

    @MCKeep
    public static final class CloseButton implements Parcelable {
        public static final Parcelable.Creator<CloseButton> CREATOR = new C11628b();
        public static final C11627a Companion = new C11627a((DefaultConstructorMarker) null);
        private final Alignment alignment;

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton$a */
        public static final class C11627a {
            private C11627a() {
            }

            public /* synthetic */ C11627a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final CloseButton mo30588a() {
                return new CloseButton((Alignment) null, 1, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton$b */
        public static final class C11628b implements Parcelable.Creator<CloseButton> {
            /* renamed from: a */
            public final CloseButton createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new CloseButton(Alignment.valueOf(parcel.readString()));
            }

            /* renamed from: a */
            public final CloseButton[] newArray(int i) {
                return new CloseButton[i];
            }
        }

        public CloseButton() {
            this((Alignment) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, Alignment alignment2, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment2 = closeButton.alignment;
            }
            return closeButton.copy(alignment2);
        }

        public static final CloseButton defaultCloseButton() {
            return Companion.mo30588a();
        }

        /* renamed from: -deprecated_alignment  reason: not valid java name */
        public final Alignment m124945deprecated_alignment() {
            return this.alignment;
        }

        /* renamed from: -toJson  reason: not valid java name */
        public final JSONObject m124946toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alignment", alignment().name());
            return jSONObject;
        }

        public final Alignment alignment() {
            return this.alignment;
        }

        public final Alignment component1() {
            return this.alignment;
        }

        public final CloseButton copy(Alignment alignment2) {
            C41536l.m120489i(alignment2, "alignment");
            return new CloseButton(alignment2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseButton) && this.alignment == ((CloseButton) obj).alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "CloseButton(alignment=" + this.alignment + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.alignment.name());
        }

        public CloseButton(Alignment alignment2) {
            C41536l.m120489i(alignment2, "alignment");
            this.alignment = alignment2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CloseButton(Alignment alignment2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Alignment.end : alignment2);
        }
    }

    @MCKeep
    public enum LayoutOrder {
        ImageTitleBody,
        TitleImageBody
    }

    @MCKeep
    public static final class Media implements Parcelable {
        public static final Parcelable.Creator<Media> CREATOR = new C11629a();
        private final String altText;
        private final String borderColor;
        private final Size borderWidth;
        private final Size cornerRadius;
        private final ImageSize size;
        private final String url;

        @MCKeep
        public enum ImageSize {
            full,
            e2e,
            inset
        }

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$Media$a */
        public static final class C11629a implements Parcelable.Creator<Media> {
            /* renamed from: a */
            public final Media createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Media(parcel.readString(), ImageSize.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()));
            }

            /* renamed from: a */
            public final Media[] newArray(int i) {
                return new Media[i];
            }
        }

        public Media(String str, ImageSize imageSize, String str2, Size size2, String str3, Size size3) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C41536l.m120489i(imageSize, "size");
            C41536l.m120489i(size2, "borderWidth");
            C41536l.m120489i(size3, "cornerRadius");
            this.url = str;
            this.size = imageSize;
            this.altText = str2;
            this.borderWidth = size2;
            this.borderColor = str3;
            this.cornerRadius = size3;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, ImageSize imageSize, String str2, Size size2, String str3, Size size3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.url;
            }
            if ((i & 2) != 0) {
                imageSize = media.size;
            }
            ImageSize imageSize2 = imageSize;
            if ((i & 4) != 0) {
                str2 = media.altText;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                size2 = media.borderWidth;
            }
            Size size4 = size2;
            if ((i & 16) != 0) {
                str3 = media.borderColor;
            }
            String str5 = str3;
            if ((i & 32) != 0) {
                size3 = media.cornerRadius;
            }
            return media.copy(str, imageSize2, str4, size4, str5, size3);
        }

        /* renamed from: -deprecated_altText  reason: not valid java name */
        public final String m124947deprecated_altText() {
            return this.altText;
        }

        /* renamed from: -deprecated_borderColor  reason: not valid java name */
        public final String m124948deprecated_borderColor() {
            return this.borderColor;
        }

        /* renamed from: -deprecated_borderWidth  reason: not valid java name */
        public final Size m124949deprecated_borderWidth() {
            return this.borderWidth;
        }

        /* renamed from: -deprecated_cornerRadius  reason: not valid java name */
        public final Size m124950deprecated_cornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: -deprecated_size  reason: not valid java name */
        public final ImageSize m124951deprecated_size() {
            return this.size;
        }

        /* renamed from: -deprecated_url  reason: not valid java name */
        public final String m124952deprecated_url() {
            return this.url;
        }

        /* renamed from: -toJson  reason: not valid java name */
        public final JSONObject m124953toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C11769i.C11770a.f34149l, url());
            jSONObject.put("size", size().name());
            if (altText() != null) {
                jSONObject.put("altText", altText());
            }
            jSONObject.put("borderWidth", borderWidth().name());
            if (borderColor() != null) {
                jSONObject.put("borderColor", borderColor());
            }
            jSONObject.put("cornerRadius", cornerRadius());
            return jSONObject;
        }

        public final String altText() {
            return this.altText;
        }

        public final String borderColor() {
            return this.borderColor;
        }

        public final Size borderWidth() {
            return this.borderWidth;
        }

        public final String component1() {
            return this.url;
        }

        public final ImageSize component2() {
            return this.size;
        }

        public final String component3() {
            return this.altText;
        }

        public final Size component4() {
            return this.borderWidth;
        }

        public final String component5() {
            return this.borderColor;
        }

        public final Size component6() {
            return this.cornerRadius;
        }

        public final Media copy(String str, ImageSize imageSize, String str2, Size size2, String str3, Size size3) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C41536l.m120489i(imageSize, "size");
            C41536l.m120489i(size2, "borderWidth");
            C41536l.m120489i(size3, "cornerRadius");
            return new Media(str, imageSize, str2, size2, str3, size3);
        }

        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Media)) {
                return false;
            }
            Media media = (Media) obj;
            return C41536l.m120484d(this.url, media.url) && this.size == media.size && C41536l.m120484d(this.altText, media.altText) && this.borderWidth == media.borderWidth && C41536l.m120484d(this.borderColor, media.borderColor) && this.cornerRadius == media.cornerRadius;
        }

        public int hashCode() {
            int hashCode = ((this.url.hashCode() * 31) + this.size.hashCode()) * 31;
            String str = this.altText;
            int i = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.borderWidth.hashCode()) * 31;
            String str2 = this.borderColor;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.cornerRadius.hashCode();
        }

        public final ImageSize size() {
            return this.size;
        }

        public String toString() {
            return "Media(url=" + this.url + ", size=" + this.size + ", altText=" + this.altText + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + ", cornerRadius=" + this.cornerRadius + ')';
        }

        public final String url() {
            return this.url;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.url);
            parcel.writeString(this.size.name());
            parcel.writeString(this.altText);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.borderColor);
            parcel.writeString(this.cornerRadius.name());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Media(String str, ImageSize imageSize, String str2, Size size2, String str3, Size size3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ImageSize.e2e : imageSize, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Size.s : size2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? Size.s : size3);
        }
    }

    @MCKeep
    public enum Size {
        s,
        m,
        l
    }

    @MCKeep
    public static final class TextField implements Parcelable {
        public static final Parcelable.Creator<TextField> CREATOR = new C11630a();
        private final Alignment alignment;
        private final String fontColor;
        private final Size fontSize;
        private final String text;

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField$a */
        public static final class C11630a implements Parcelable.Creator<TextField> {
            /* renamed from: a */
            public final TextField createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new TextField(parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Alignment.valueOf(parcel.readString()));
            }

            /* renamed from: a */
            public final TextField[] newArray(int i) {
                return new TextField[i];
            }
        }

        public TextField(String str, Size size, String str2, Alignment alignment2) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(size, "fontSize");
            C41536l.m120489i(alignment2, "alignment");
            this.text = str;
            this.fontSize = size;
            this.fontColor = str2;
            this.alignment = alignment2;
        }

        public static /* synthetic */ TextField copy$default(TextField textField, String str, Size size, String str2, Alignment alignment2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textField.text;
            }
            if ((i & 2) != 0) {
                size = textField.fontSize;
            }
            if ((i & 4) != 0) {
                str2 = textField.fontColor;
            }
            if ((i & 8) != 0) {
                alignment2 = textField.alignment;
            }
            return textField.copy(str, size, str2, alignment2);
        }

        /* renamed from: -deprecated_alignment  reason: not valid java name */
        public final Alignment m124954deprecated_alignment() {
            return this.alignment;
        }

        /* renamed from: -deprecated_fontColor  reason: not valid java name */
        public final String m124955deprecated_fontColor() {
            return this.fontColor;
        }

        /* renamed from: -deprecated_fontSize  reason: not valid java name */
        public final Size m124956deprecated_fontSize() {
            return this.fontSize;
        }

        /* renamed from: -deprecated_text  reason: not valid java name */
        public final String m124957deprecated_text() {
            return this.text;
        }

        /* renamed from: -toJson  reason: not valid java name */
        public final JSONObject m124958toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", text());
            jSONObject.put("fontSize", fontSize().name());
            if (fontColor() != null) {
                jSONObject.put("fontColor", fontColor());
            }
            jSONObject.put("alignment", alignment().name());
            return jSONObject;
        }

        public final Alignment alignment() {
            return this.alignment;
        }

        public final String component1() {
            return this.text;
        }

        public final Size component2() {
            return this.fontSize;
        }

        public final String component3() {
            return this.fontColor;
        }

        public final Alignment component4() {
            return this.alignment;
        }

        public final TextField copy(String str, Size size, String str2, Alignment alignment2) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(size, "fontSize");
            C41536l.m120489i(alignment2, "alignment");
            return new TextField(str, size, str2, alignment2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) obj;
            return C41536l.m120484d(this.text, textField.text) && this.fontSize == textField.fontSize && C41536l.m120484d(this.fontColor, textField.fontColor) && this.alignment == textField.alignment;
        }

        public final String fontColor() {
            return this.fontColor;
        }

        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int hashCode = ((this.text.hashCode() * 31) + this.fontSize.hashCode()) * 31;
            String str = this.fontColor;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.alignment.hashCode();
        }

        public final String text() {
            return this.text;
        }

        public String toString() {
            return "TextField(text=" + this.text + ", fontSize=" + this.fontSize + ", fontColor=" + this.fontColor + ", alignment=" + this.alignment + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.text);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.fontColor);
            parcel.writeString(this.alignment.name());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TextField(String str, Size size, String str2, Alignment alignment2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? Size.s : size, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Alignment.center : alignment2);
        }
    }

    @MCKeep
    public enum Type {
        bannerTop,
        bannerBottom,
        modal,
        full,
        fullImageFill
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$a */
    public static final class C11631a implements Parcelable.Creator<InAppMessage> {
        /* renamed from: a */
        public final InAppMessage createFromParcel(Parcel parcel) {
            Size size;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Date date3 = (Date) parcel.readSerializable();
            int readInt2 = parcel.readInt();
            Type valueOf = Type.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            String readString4 = parcel.readString();
            Size valueOf2 = Size.valueOf(parcel.readString());
            String readString5 = parcel.readString();
            Size valueOf3 = Size.valueOf(parcel.readString());
            LayoutOrder valueOf4 = LayoutOrder.valueOf(parcel.readString());
            Media createFromParcel = parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel2);
            TextField createFromParcel2 = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel2);
            TextField createFromParcel3 = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel2);
            CloseButton createFromParcel4 = parcel.readInt() == 0 ? null : CloseButton.CREATOR.createFromParcel(parcel2);
            ButtonConfig valueOf5 = ButtonConfig.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
                size = valueOf2;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                size = valueOf2;
                int i = 0;
                while (i != readInt3) {
                    arrayList2.add(Button.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt3 = readInt3;
                }
                arrayList = arrayList2;
            }
            return new InAppMessage(readString, readString2, readInt, date, date2, date3, readInt2, valueOf, readString3, readLong, readString4, size, readString5, valueOf3, valueOf4, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, valueOf5, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: a */
        public final InAppMessage[] newArray(int i) {
            return new InAppMessage[i];
        }
    }

    public InAppMessage(String str, String str2, int i, Date date, Date date2, Date date3, int i2, Type type2, String str3, long j, String str4, Size size, String str5, Size size2, LayoutOrder layoutOrder2, Media media2, TextField textField, TextField textField2, CloseButton closeButton2, ButtonConfig buttonConfig, List<Button> list, int i3, boolean z) {
        Type type3 = type2;
        Size size3 = size;
        Size size4 = size2;
        LayoutOrder layoutOrder3 = layoutOrder2;
        ButtonConfig buttonConfig2 = buttonConfig;
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "activityInstanceId");
        C41536l.m120489i(type3, "type");
        C41536l.m120489i(size3, "borderWidth");
        C41536l.m120489i(size4, "cornerRadius");
        C41536l.m120489i(layoutOrder3, "layoutOrder");
        C41536l.m120489i(buttonConfig2, "buttonConfiguration");
        this.f33732id = str;
        this.activityInstanceId = str2;
        this.priority = i;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.modifiedDateUtc = date3;
        this.displayLimit = i2;
        this.type = type3;
        this.windowColor = str3;
        this.displayDuration = j;
        this.backgroundColor = str4;
        this.borderWidth = size3;
        this.borderColor = str5;
        this.cornerRadius = size4;
        this.layoutOrder = layoutOrder3;
        this.media = media2;
        this.title = textField;
        this.body = textField2;
        this.closeButton = closeButton2;
        this.buttonConfiguration = buttonConfig2;
        this.buttons = list;
        this.messageDelaySec = i3;
        this.displayLimitOverride = z;
    }

    public static /* synthetic */ InAppMessage copy$default(InAppMessage inAppMessage, String str, String str2, int i, Date date, Date date2, Date date3, int i2, Type type2, String str3, long j, String str4, Size size, String str5, Size size2, LayoutOrder layoutOrder2, Media media2, TextField textField, TextField textField2, CloseButton closeButton2, ButtonConfig buttonConfig, List list, int i3, boolean z, int i4, Object obj) {
        InAppMessage inAppMessage2 = inAppMessage;
        int i5 = i4;
        return inAppMessage.copy((i5 & 1) != 0 ? inAppMessage2.f33732id : str, (i5 & 2) != 0 ? inAppMessage2.activityInstanceId : str2, (i5 & 4) != 0 ? inAppMessage2.priority : i, (i5 & 8) != 0 ? inAppMessage2.startDateUtc : date, (i5 & 16) != 0 ? inAppMessage2.endDateUtc : date2, (i5 & 32) != 0 ? inAppMessage2.modifiedDateUtc : date3, (i5 & 64) != 0 ? inAppMessage2.displayLimit : i2, (i5 & 128) != 0 ? inAppMessage2.type : type2, (i5 & C11398b.f33139r) != 0 ? inAppMessage2.windowColor : str3, (i5 & C11398b.f33140s) != 0 ? inAppMessage2.displayDuration : j, (i5 & C11398b.f33141t) != 0 ? inAppMessage2.backgroundColor : str4, (i5 & C11398b.f33142u) != 0 ? inAppMessage2.borderWidth : size, (i5 & C11398b.f33143v) != 0 ? inAppMessage2.borderColor : str5, (i5 & 8192) != 0 ? inAppMessage2.cornerRadius : size2, (i5 & 16384) != 0 ? inAppMessage2.layoutOrder : layoutOrder2, (i5 & 32768) != 0 ? inAppMessage2.media : media2, (i5 & 65536) != 0 ? inAppMessage2.title : textField, (i5 & 131072) != 0 ? inAppMessage2.body : textField2, (i5 & 262144) != 0 ? inAppMessage2.closeButton : closeButton2, (i5 & 524288) != 0 ? inAppMessage2.buttonConfiguration : buttonConfig, (i5 & 1048576) != 0 ? inAppMessage2.buttons : list, (i5 & 2097152) != 0 ? inAppMessage2.messageDelaySec : i3, (i5 & 4194304) != 0 ? inAppMessage2.displayLimitOverride : z);
    }

    /* renamed from: -activityInstanceId  reason: not valid java name */
    public final String m124911activityInstanceId() {
        return this.activityInstanceId;
    }

    /* renamed from: -deprecated_backgroundColor  reason: not valid java name */
    public final String m124912deprecated_backgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final TextField m124913deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_borderColor  reason: not valid java name */
    public final String m124914deprecated_borderColor() {
        return this.borderColor;
    }

    /* renamed from: -deprecated_borderWidth  reason: not valid java name */
    public final Size m124915deprecated_borderWidth() {
        return this.borderWidth;
    }

    /* renamed from: -deprecated_buttonConfiguration  reason: not valid java name */
    public final ButtonConfig m124916deprecated_buttonConfiguration() {
        return this.buttonConfiguration;
    }

    /* renamed from: -deprecated_buttons  reason: not valid java name */
    public final List<Button> m124917deprecated_buttons() {
        return this.buttons;
    }

    /* renamed from: -deprecated_closeButton  reason: not valid java name */
    public final CloseButton m124918deprecated_closeButton() {
        return this.closeButton;
    }

    /* renamed from: -deprecated_cornerRadius  reason: not valid java name */
    public final Size m124919deprecated_cornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: -deprecated_displayDuration  reason: not valid java name */
    public final long m124920deprecated_displayDuration() {
        return this.displayDuration;
    }

    /* renamed from: -deprecated_displayLimit  reason: not valid java name */
    public final int m124921deprecated_displayLimit() {
        return this.displayLimit;
    }

    /* renamed from: -deprecated_endDateUtc  reason: not valid java name */
    public final Date m124922deprecated_endDateUtc() {
        return this.endDateUtc;
    }

    /* renamed from: -deprecated_id  reason: not valid java name */
    public final String m124923deprecated_id() {
        return this.f33732id;
    }

    /* renamed from: -deprecated_layoutOrder  reason: not valid java name */
    public final LayoutOrder m124924deprecated_layoutOrder() {
        return this.layoutOrder;
    }

    /* renamed from: -deprecated_media  reason: not valid java name */
    public final Media m124925deprecated_media() {
        return this.media;
    }

    /* renamed from: -deprecated_modifiedDateUtc  reason: not valid java name */
    public final Date m124926deprecated_modifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    /* renamed from: -deprecated_priority  reason: not valid java name */
    public final int m124927deprecated_priority() {
        return this.priority;
    }

    /* renamed from: -deprecated_startDateUtc  reason: not valid java name */
    public final Date m124928deprecated_startDateUtc() {
        return this.startDateUtc;
    }

    /* renamed from: -deprecated_title  reason: not valid java name */
    public final TextField m124929deprecated_title() {
        return this.title;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final Type m124930deprecated_type() {
        return this.type;
    }

    /* renamed from: -deprecated_windowColor  reason: not valid java name */
    public final String m124931deprecated_windowColor() {
        return this.windowColor;
    }

    /* renamed from: -toJson  reason: not valid java name */
    public final JSONObject m124932toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", mo30522id());
        jSONObject.put("activityInstanceId", m124911activityInstanceId());
        jSONObject.put("priority", priority());
        if (startDateUtc() != null) {
            jSONObject.put("startDateUtc", C11516m.m42082a(startDateUtc()));
        }
        if (endDateUtc() != null) {
            jSONObject.put("endDateUtc", C11516m.m42082a(endDateUtc()));
        }
        if (modifiedDateUtc() != null) {
            jSONObject.put("modifiedDateUtc", C11516m.m42082a(modifiedDateUtc()));
        }
        jSONObject.put("displayLimit", displayLimit());
        jSONObject.put("type", type().name());
        if (windowColor() != null) {
            jSONObject.put("windowColor", windowColor());
        }
        jSONObject.put("displayDuration", displayDuration());
        if (backgroundColor() != null) {
            jSONObject.put("backgroundColor", backgroundColor());
        }
        jSONObject.put("borderWidth", borderWidth().name());
        if (borderColor() != null) {
            jSONObject.put("borderColor", borderColor());
        }
        jSONObject.put("cornerRadius", cornerRadius().name());
        jSONObject.put("layoutOrder", layoutOrder().name());
        if (media() != null) {
            jSONObject.put("media", media().m124953toJson());
        }
        if (title() != null) {
            jSONObject.put("title", title().m124958toJson());
        }
        if (body() != null) {
            jSONObject.put("body", body().m124958toJson());
        }
        if (closeButton() != null) {
            jSONObject.put("closeButton", closeButton().m124946toJson());
        }
        jSONObject.put("buttonConfiguration", buttonConfiguration().name());
        if (buttons() != null) {
            JSONArray jSONArray = new JSONArray();
            for (Button r3 : buttons()) {
                jSONArray.put(r3.m124944toJson());
            }
            C41238w wVar = C41238w.f97225a;
            jSONObject.put("buttons", jSONArray);
        }
        jSONObject.put("messageDelaySec", messageDelaySec());
        jSONObject.put("displayLimitOverride", displayLimitOverride());
        return jSONObject;
    }

    public final String backgroundColor() {
        return this.backgroundColor;
    }

    public final TextField body() {
        return this.body;
    }

    public final String borderColor() {
        return this.borderColor;
    }

    public final Size borderWidth() {
        return this.borderWidth;
    }

    public final ButtonConfig buttonConfiguration() {
        return this.buttonConfiguration;
    }

    public final List<Button> buttons() {
        return this.buttons;
    }

    public final CloseButton closeButton() {
        return this.closeButton;
    }

    public final String component1() {
        return this.f33732id;
    }

    public final long component10() {
        return this.displayDuration;
    }

    public final String component11() {
        return this.backgroundColor;
    }

    public final Size component12() {
        return this.borderWidth;
    }

    public final String component13() {
        return this.borderColor;
    }

    public final Size component14() {
        return this.cornerRadius;
    }

    public final LayoutOrder component15() {
        return this.layoutOrder;
    }

    public final Media component16() {
        return this.media;
    }

    public final TextField component17() {
        return this.title;
    }

    public final TextField component18() {
        return this.body;
    }

    public final CloseButton component19() {
        return this.closeButton;
    }

    public final String component2$sdk_release() {
        return this.activityInstanceId;
    }

    public final ButtonConfig component20() {
        return this.buttonConfiguration;
    }

    public final List<Button> component21() {
        return this.buttons;
    }

    public final int component22() {
        return this.messageDelaySec;
    }

    public final boolean component23() {
        return this.displayLimitOverride;
    }

    public final int component3() {
        return this.priority;
    }

    public final Date component4() {
        return this.startDateUtc;
    }

    public final Date component5() {
        return this.endDateUtc;
    }

    public final Date component6() {
        return this.modifiedDateUtc;
    }

    public final int component7() {
        return this.displayLimit;
    }

    public final Type component8() {
        return this.type;
    }

    public final String component9() {
        return this.windowColor;
    }

    public final InAppMessage copy(String str, String str2, int i, Date date, Date date2, Date date3, int i2, Type type2, String str3, long j, String str4, Size size, String str5, Size size2, LayoutOrder layoutOrder2, Media media2, TextField textField, TextField textField2, CloseButton closeButton2, ButtonConfig buttonConfig, List<Button> list, int i3, boolean z) {
        String str6 = str;
        C41536l.m120489i(str6, "id");
        C41536l.m120489i(str2, "activityInstanceId");
        C41536l.m120489i(type2, "type");
        C41536l.m120489i(size, "borderWidth");
        C41536l.m120489i(size2, "cornerRadius");
        C41536l.m120489i(layoutOrder2, "layoutOrder");
        C41536l.m120489i(buttonConfig, "buttonConfiguration");
        return new InAppMessage(str6, str2, i, date, date2, date3, i2, type2, str3, j, str4, size, str5, size2, layoutOrder2, media2, textField, textField2, closeButton2, buttonConfig, list, i3, z);
    }

    public final Size cornerRadius() {
        return this.cornerRadius;
    }

    public int describeContents() {
        return 0;
    }

    public final long displayDuration() {
        return this.displayDuration;
    }

    public final int displayLimit() {
        return this.displayLimit;
    }

    public final boolean displayLimitOverride() {
        return this.displayLimitOverride;
    }

    public final Date endDateUtc() {
        return this.endDateUtc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) obj;
        return C41536l.m120484d(this.f33732id, inAppMessage.f33732id) && C41536l.m120484d(this.activityInstanceId, inAppMessage.activityInstanceId) && this.priority == inAppMessage.priority && C41536l.m120484d(this.startDateUtc, inAppMessage.startDateUtc) && C41536l.m120484d(this.endDateUtc, inAppMessage.endDateUtc) && C41536l.m120484d(this.modifiedDateUtc, inAppMessage.modifiedDateUtc) && this.displayLimit == inAppMessage.displayLimit && this.type == inAppMessage.type && C41536l.m120484d(this.windowColor, inAppMessage.windowColor) && this.displayDuration == inAppMessage.displayDuration && C41536l.m120484d(this.backgroundColor, inAppMessage.backgroundColor) && this.borderWidth == inAppMessage.borderWidth && C41536l.m120484d(this.borderColor, inAppMessage.borderColor) && this.cornerRadius == inAppMessage.cornerRadius && this.layoutOrder == inAppMessage.layoutOrder && C41536l.m120484d(this.media, inAppMessage.media) && C41536l.m120484d(this.title, inAppMessage.title) && C41536l.m120484d(this.body, inAppMessage.body) && C41536l.m120484d(this.closeButton, inAppMessage.closeButton) && this.buttonConfiguration == inAppMessage.buttonConfiguration && C41536l.m120484d(this.buttons, inAppMessage.buttons) && this.messageDelaySec == inAppMessage.messageDelaySec && this.displayLimitOverride == inAppMessage.displayLimitOverride;
    }

    public int hashCode() {
        int hashCode = ((((this.f33732id.hashCode() * 31) + this.activityInstanceId.hashCode()) * 31) + this.priority) * 31;
        Date date = this.startDateUtc;
        int i = 0;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.modifiedDateUtc;
        int hashCode4 = (((((hashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31) + this.displayLimit) * 31) + this.type.hashCode()) * 31;
        String str = this.windowColor;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.displayDuration)) * 31;
        String str2 = this.backgroundColor;
        int hashCode6 = (((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.borderWidth.hashCode()) * 31;
        String str3 = this.borderColor;
        int hashCode7 = (((((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.cornerRadius.hashCode()) * 31) + this.layoutOrder.hashCode()) * 31;
        Media media2 = this.media;
        int hashCode8 = (hashCode7 + (media2 == null ? 0 : media2.hashCode())) * 31;
        TextField textField = this.title;
        int hashCode9 = (hashCode8 + (textField == null ? 0 : textField.hashCode())) * 31;
        TextField textField2 = this.body;
        int hashCode10 = (hashCode9 + (textField2 == null ? 0 : textField2.hashCode())) * 31;
        CloseButton closeButton2 = this.closeButton;
        int hashCode11 = (((hashCode10 + (closeButton2 == null ? 0 : closeButton2.hashCode())) * 31) + this.buttonConfiguration.hashCode()) * 31;
        List<Button> list = this.buttons;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (((hashCode11 + i) * 31) + this.messageDelaySec) * 31;
        boolean z = this.displayLimitOverride;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: id */
    public final String mo30522id() {
        return this.f33732id;
    }

    public final LayoutOrder layoutOrder() {
        return this.layoutOrder;
    }

    public final Media media() {
        return this.media;
    }

    public final int messageDelaySec() {
        return this.messageDelaySec;
    }

    public final Date modifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    public final int priority() {
        return this.priority;
    }

    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    public final TextField title() {
        return this.title;
    }

    public String toString() {
        return "InAppMessage(id=" + this.f33732id + ", activityInstanceId=" + this.activityInstanceId + ", priority=" + this.priority + ", startDateUtc=" + this.startDateUtc + ", endDateUtc=" + this.endDateUtc + ", modifiedDateUtc=" + this.modifiedDateUtc + ", displayLimit=" + this.displayLimit + ", type=" + this.type + ", windowColor=" + this.windowColor + ", displayDuration=" + this.displayDuration + ", backgroundColor=" + this.backgroundColor + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + ", cornerRadius=" + this.cornerRadius + ", layoutOrder=" + this.layoutOrder + ", media=" + this.media + ", title=" + this.title + ", body=" + this.body + ", closeButton=" + this.closeButton + ", buttonConfiguration=" + this.buttonConfiguration + ", buttons=" + this.buttons + ", messageDelaySec=" + this.messageDelaySec + ", displayLimitOverride=" + this.displayLimitOverride + ')';
    }

    public final Type type() {
        return this.type;
    }

    public final String windowColor() {
        return this.windowColor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f33732id);
        parcel.writeString(this.activityInstanceId);
        parcel.writeInt(this.priority);
        parcel.writeSerializable(this.startDateUtc);
        parcel.writeSerializable(this.endDateUtc);
        parcel.writeSerializable(this.modifiedDateUtc);
        parcel.writeInt(this.displayLimit);
        parcel.writeString(this.type.name());
        parcel.writeString(this.windowColor);
        parcel.writeLong(this.displayDuration);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.borderWidth.name());
        parcel.writeString(this.borderColor);
        parcel.writeString(this.cornerRadius.name());
        parcel.writeString(this.layoutOrder.name());
        Media media2 = this.media;
        if (media2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media2.writeToParcel(parcel, i);
        }
        TextField textField = this.title;
        if (textField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField.writeToParcel(parcel, i);
        }
        TextField textField2 = this.body;
        if (textField2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField2.writeToParcel(parcel, i);
        }
        CloseButton closeButton2 = this.closeButton;
        if (closeButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closeButton2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.buttonConfiguration.name());
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Button writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.messageDelaySec);
        parcel.writeInt(this.displayLimitOverride ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InAppMessage(java.lang.String r28, java.lang.String r29, int r30, java.util.Date r31, java.util.Date r32, java.util.Date r33, int r34, com.salesforce.marketingcloud.messages.iam.InAppMessage.Type r35, java.lang.String r36, long r37, java.lang.String r39, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r40, java.lang.String r41, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r42, com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder r43, com.salesforce.marketingcloud.messages.iam.InAppMessage.Media r44, com.salesforce.marketingcloud.messages.iam.InAppMessage.TextField r45, com.salesforce.marketingcloud.messages.iam.InAppMessage.TextField r46, com.salesforce.marketingcloud.messages.iam.InAppMessage.CloseButton r47, com.salesforce.marketingcloud.messages.iam.InAppMessage.ButtonConfig r48, java.util.List r49, int r50, boolean r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            r27 = this;
            r0 = r52
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000a
            r1 = 999(0x3e7, float:1.4E-42)
            r5 = r1
            goto L_0x000c
        L_0x000a:
            r5 = r30
        L_0x000c:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r6 = r2
            goto L_0x0015
        L_0x0013:
            r6 = r31
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001b
            r7 = r2
            goto L_0x001d
        L_0x001b:
            r7 = r32
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r8 = r2
            goto L_0x0025
        L_0x0023:
            r8 = r33
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002c
            r1 = 1
            r9 = r1
            goto L_0x002e
        L_0x002c:
            r9 = r34
        L_0x002e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0034
            r11 = r2
            goto L_0x0036
        L_0x0034:
            r11 = r36
        L_0x0036:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003e
            r3 = -1
            r12 = r3
            goto L_0x0040
        L_0x003e:
            r12 = r37
        L_0x0040:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0048
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
            r15 = r1
            goto L_0x004a
        L_0x0048:
            r15 = r40
        L_0x004a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0051
            r16 = r2
            goto L_0x0053
        L_0x0051:
            r16 = r41
        L_0x0053:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005c
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
            r17 = r1
            goto L_0x005e
        L_0x005c:
            r17 = r42
        L_0x005e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0067
            com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.ImageTitleBody
            r18 = r1
            goto L_0x0069
        L_0x0067:
            r18 = r43
        L_0x0069:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0072
            r19 = r2
            goto L_0x0074
        L_0x0072:
            r19 = r44
        L_0x0074:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007c
            r20 = r2
            goto L_0x007e
        L_0x007c:
            r20 = r45
        L_0x007e:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0086
            r21 = r2
            goto L_0x0088
        L_0x0086:
            r21 = r46
        L_0x0088:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r22 = r2
            goto L_0x0092
        L_0x0090:
            r22 = r47
        L_0x0092:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009c
            com.salesforce.marketingcloud.messages.iam.InAppMessage$ButtonConfig r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.ButtonConfig.twoUp
            r23 = r1
            goto L_0x009e
        L_0x009c:
            r23 = r48
        L_0x009e:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            r24 = r2
            goto L_0x00a8
        L_0x00a6:
            r24 = r49
        L_0x00a8:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x00b1
            r25 = r2
            goto L_0x00b3
        L_0x00b1:
            r25 = r50
        L_0x00b3:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00bb
            r26 = r2
            goto L_0x00bd
        L_0x00bb:
            r26 = r51
        L_0x00bd:
            r2 = r27
            r3 = r28
            r4 = r29
            r10 = r35
            r14 = r39
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.InAppMessage.<init>(java.lang.String, java.lang.String, int, java.util.Date, java.util.Date, java.util.Date, int, com.salesforce.marketingcloud.messages.iam.InAppMessage$Type, java.lang.String, long, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder, com.salesforce.marketingcloud.messages.iam.InAppMessage$Media, com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField, com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField, com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton, com.salesforce.marketingcloud.messages.iam.InAppMessage$ButtonConfig, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InAppMessage(org.json.JSONObject r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"id\")"
            kotlin.jvm.internal.C41536l.m120488h(r3, r1)
            java.lang.String r1 = "activityInstanceId"
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"activityInstanceId\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r1)
            java.lang.String r1 = "priority"
            r2 = 999(0x3e7, float:1.4E-42)
            int r5 = r0.optInt(r1, r2)
            java.lang.String r1 = "startDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"startDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x0038
            r6 = 0
            goto L_0x003d
        L_0x0038:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r6 = r1
        L_0x003d:
            java.lang.String r1 = "endDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r7 = "json.optString(\"endDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r7)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x0050
            r7 = 0
            goto L_0x0055
        L_0x0050:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r7 = r1
        L_0x0055:
            java.lang.String r1 = "modifiedDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r8 = "json.optString(\"modifiedDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r8)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x0068
            r8 = 0
            goto L_0x006d
        L_0x0068:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r8 = r1
        L_0x006d:
            java.lang.String r1 = "displayLimit"
            r9 = 1
            int r9 = r0.optInt(r1, r9)
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r10 = "json.getString(\"type\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r10)
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r10 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.valueOf(r1)
            java.lang.String r1 = "windowColor"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r11 = "json.optString(\"windowColor\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r11)
            java.lang.String r11 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "displayDuration"
            r12 = -1
            long r12 = r0.optLong(r1, r12)
            java.lang.String r1 = "backgroundColor"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r14 = "json.optString(\"backgroundColor\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r14)
            java.lang.String r14 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s
            java.lang.String r15 = "borderWidth"
            java.lang.String r15 = r0.optString(r15)
            java.lang.String r2 = "optString(name)"
            kotlin.jvm.internal.C41536l.m120488h(r15, r2)
            java.lang.String r15 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r15)
            if (r15 == 0) goto L_0x00c3
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r15 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.valueOf(r15)
            r17 = r1
            goto L_0x00c6
        L_0x00c3:
            r15 = r1
            r17 = r15
        L_0x00c6:
            java.lang.String r1 = "borderColor"
            java.lang.String r1 = r0.optString(r1)
            r18 = r15
            java.lang.String r15 = "json.optString(\"borderColor\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r15)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r15 = "cornerRadius"
            java.lang.String r15 = r0.optString(r15)
            kotlin.jvm.internal.C41536l.m120488h(r15, r2)
            java.lang.String r15 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r15)
            if (r15 == 0) goto L_0x00ec
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r15 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.valueOf(r15)
            r17 = r15
        L_0x00ec:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder r15 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.ImageTitleBody
            r19 = r15
            java.lang.String r15 = "layoutOrder"
            java.lang.String r15 = r0.optString(r15)
            kotlin.jvm.internal.C41536l.m120488h(r15, r2)
            java.lang.String r15 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r15)
            if (r15 == 0) goto L_0x0105
            com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder r15 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.valueOf(r15)
            r19 = r15
        L_0x0105:
            java.lang.String r15 = "media"
            org.json.JSONObject r15 = r0.optJSONObject(r15)
            if (r15 != 0) goto L_0x0110
            r20 = 0
            goto L_0x0116
        L_0x0110:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Media r15 = com.salesforce.marketingcloud.messages.iam.C11649h.m42521b(r15)
            r20 = r15
        L_0x0116:
            java.lang.String r15 = "title"
            org.json.JSONObject r15 = r0.optJSONObject(r15)
            if (r15 != 0) goto L_0x0121
            r21 = 0
            goto L_0x0127
        L_0x0121:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField r15 = com.salesforce.marketingcloud.messages.iam.C11649h.m42522c(r15)
            r21 = r15
        L_0x0127:
            java.lang.String r15 = "body"
            org.json.JSONObject r15 = r0.optJSONObject(r15)
            if (r15 != 0) goto L_0x0132
            r22 = 0
            goto L_0x0138
        L_0x0132:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField r15 = com.salesforce.marketingcloud.messages.iam.C11649h.m42522c(r15)
            r22 = r15
        L_0x0138:
            java.lang.String r15 = "closeButton"
            org.json.JSONObject r15 = r0.optJSONObject(r15)
            if (r15 != 0) goto L_0x0143
            r23 = 0
            goto L_0x0149
        L_0x0143:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton r15 = com.salesforce.marketingcloud.messages.iam.C11649h.m42519a((org.json.JSONObject) r15)
            r23 = r15
        L_0x0149:
            com.salesforce.marketingcloud.messages.iam.InAppMessage$ButtonConfig r15 = com.salesforce.marketingcloud.messages.iam.InAppMessage.ButtonConfig.twoUp
            r24 = r15
            java.lang.String r15 = "buttonConfiguration"
            java.lang.String r15 = r0.optString(r15)
            kotlin.jvm.internal.C41536l.m120488h(r15, r2)
            java.lang.String r2 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r15)
            if (r2 == 0) goto L_0x0162
            com.salesforce.marketingcloud.messages.iam.InAppMessage$ButtonConfig r2 = com.salesforce.marketingcloud.messages.iam.InAppMessage.ButtonConfig.valueOf(r2)
            r24 = r2
        L_0x0162:
            java.lang.String r2 = "buttons"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            if (r2 != 0) goto L_0x016d
            r27 = 0
            goto L_0x0173
        L_0x016d:
            java.util.List r2 = com.salesforce.marketingcloud.messages.iam.C11649h.m42520a((org.json.JSONArray) r2)
            r27 = r2
        L_0x0173:
            java.lang.String r2 = "messageDelaySec"
            r15 = 0
            int r25 = r0.optInt(r2, r15)
            java.lang.String r2 = "displayLimitOverride"
            boolean r26 = r0.optBoolean(r2, r15)
            r2 = r28
            r15 = r18
            r16 = r1
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.InAppMessage.<init>(org.json.JSONObject):void");
    }
}

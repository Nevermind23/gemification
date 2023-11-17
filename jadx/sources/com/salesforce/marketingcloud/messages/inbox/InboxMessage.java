package com.salesforce.marketingcloud.messages.inbox;

import android.os.Bundle;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

@MCKeep
public final class InboxMessage {
    private final String alert;
    private final String custom;
    private final Map<String, String> customKeys;
    private boolean deleted;
    private boolean dirty;
    private final Date endDateUtc;

    /* renamed from: id */
    private final String f33812id;
    private final Media media;
    private final String messageHash;
    private boolean read;
    private final String requestId;
    private final Date sendDateUtc;
    private final String sound;
    private final Date startDateUtc;
    private final String subject;
    private final String title;
    private final String url;
    private final int viewCount;

    @MCKeep
    public static final class Media {
        private final String altText;
        private final String url;

        public Media(String str, String str2) {
            this.url = str;
            this.altText = str2;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.url;
            }
            if ((i & 2) != 0) {
                str2 = media.altText;
            }
            return media.copy(str, str2);
        }

        public final String altText() {
            return this.altText;
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.altText;
        }

        public final Media copy(String str, String str2) {
            return new Media(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Media)) {
                return false;
            }
            Media media = (Media) obj;
            return C41536l.m120484d(this.url, media.url) && C41536l.m120484d(this.altText, media.altText);
        }

        public final String getAltText() {
            return this.altText;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.altText;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Media(url=" + this.url + ", altText=" + this.altText + ')';
        }

        public final String url() {
            return this.url;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (cf1.C40439w.m117109H(r11, ".google", false, 2, (java.lang.Object) null) != false) goto L_0x007b;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InboxMessage(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "bundle"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "_m"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x00d3
            java.lang.String r2 = "title"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "alert"
            java.lang.String r8 = r0.getString(r2)
            java.lang.String r2 = "sound"
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r2 = "_h"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "_r"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "_x"
            java.lang.String r14 = r0.getString(r2)
            if (r14 == 0) goto L_0x00c9
            com.salesforce.marketingcloud.messages.inbox.InboxMessage$Media r10 = m124959_init_$lambda0(r21)
            java.util.Set r1 = r21.keySet()
            java.lang.String r2 = "bundle.keySet()"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x004d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r1.next()
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            com.salesforce.marketingcloud.notifications.NotificationMessage$a r12 = com.salesforce.marketingcloud.notifications.NotificationMessage.Companion
            java.lang.String[] r12 = r12.mo30945a()
            boolean r12 = ie1.C41333m.m119794s(r12, r11)
            if (r12 == 0) goto L_0x0079
            java.lang.String r12 = "key"
            kotlin.jvm.internal.C41536l.m120488h(r11, r12)
            r12 = 2
            r13 = 0
            java.lang.String r15 = ".google"
            r16 = r1
            r1 = 0
            boolean r11 = cf1.C40439w.m117109H(r11, r15, r1, r12, r13)
            if (r11 == 0) goto L_0x007c
            goto L_0x007b
        L_0x0079:
            r16 = r1
        L_0x007b:
            r1 = 1
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r2.add(r6)
        L_0x0081:
            r1 = r16
            goto L_0x004d
        L_0x0084:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r2, r6)
            int r6 = ie1.C41342q0.m119921f(r6)
            r11 = 16
            int r6 = ze1.C43429k.m124585d(r6, r11)
            r1.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x009d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b6
            java.lang.Object r6 = r2.next()
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r0.getString(r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.put(r6, r11)
            goto L_0x009d
        L_0x00b6:
            r6 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 22280(0x5708, float:3.1221E-41)
            r19 = 0
            r2 = r20
            r16 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.InboxMessage.<init>(android.os.Bundle):void");
    }

    /* renamed from: _init_$lambda-0  reason: not valid java name */
    private static final Media m124959_init_$lambda0(Bundle bundle) {
        C41536l.m120489i(bundle, "$bundle");
        String string = bundle.getString(NotificationMessage.NOTIF_KEY_MEDIA_URL);
        String string2 = bundle.getString(NotificationMessage.NOTIF_KEY_MEDIA_ALT);
        if (!TextUtils.isEmpty(string)) {
            return new Media(string, string2);
        }
        return null;
    }

    public static /* synthetic */ InboxMessage copy$default(InboxMessage inboxMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, Media media2, Date date, Date date2, Date date3, String str8, String str9, Map map, int i, int i2, Object obj) {
        InboxMessage inboxMessage2 = inboxMessage;
        int i3 = i2;
        return inboxMessage.copy((i3 & 1) != 0 ? inboxMessage2.f33812id : str, (i3 & 2) != 0 ? inboxMessage2.requestId : str2, (i3 & 4) != 0 ? inboxMessage2.messageHash : str3, (i3 & 8) != 0 ? inboxMessage2.subject : str4, (i3 & 16) != 0 ? inboxMessage2.title : str5, (i3 & 32) != 0 ? inboxMessage2.alert : str6, (i3 & 64) != 0 ? inboxMessage2.sound : str7, (i3 & 128) != 0 ? inboxMessage2.media : media2, (i3 & C11398b.f33139r) != 0 ? inboxMessage2.startDateUtc : date, (i3 & C11398b.f33140s) != 0 ? inboxMessage2.endDateUtc : date2, (i3 & C11398b.f33141t) != 0 ? inboxMessage2.sendDateUtc : date3, (i3 & C11398b.f33142u) != 0 ? inboxMessage2.url : str8, (i3 & C11398b.f33143v) != 0 ? inboxMessage2.custom : str9, (i3 & 8192) != 0 ? inboxMessage2.customKeys : map, (i3 & 16384) != 0 ? inboxMessage2.viewCount : i);
    }

    /* renamed from: -deleted  reason: not valid java name */
    public final void m124960deleted(boolean z) {
        this.deleted = z;
    }

    /* renamed from: -deprecated_alert  reason: not valid java name */
    public final String m124961deprecated_alert() {
        return this.alert;
    }

    /* renamed from: -deprecated_custom  reason: not valid java name */
    public final String m124962deprecated_custom() {
        return this.custom;
    }

    /* renamed from: -deprecated_customKeys  reason: not valid java name */
    public final Map<String, String> m124963deprecated_customKeys() {
        return this.customKeys;
    }

    /* renamed from: -deprecated_deleted  reason: not valid java name */
    public final boolean m124964deprecated_deleted() {
        return this.deleted;
    }

    /* renamed from: -deprecated_endDateUtc  reason: not valid java name */
    public final Date m124965deprecated_endDateUtc() {
        return this.endDateUtc;
    }

    /* renamed from: -deprecated_id  reason: not valid java name */
    public final String m124966deprecated_id() {
        return this.f33812id;
    }

    /* renamed from: -deprecated_media  reason: not valid java name */
    public final Media m124967deprecated_media() {
        return this.media;
    }

    /* renamed from: -deprecated_read  reason: not valid java name */
    public final boolean m124968deprecated_read() {
        return this.read;
    }

    /* renamed from: -deprecated_sendDateUtc  reason: not valid java name */
    public final Date m124969deprecated_sendDateUtc() {
        return this.sendDateUtc;
    }

    /* renamed from: -deprecated_sound  reason: not valid java name */
    public final String m124970deprecated_sound() {
        return this.sound;
    }

    /* renamed from: -deprecated_startDateUtc  reason: not valid java name */
    public final Date m124971deprecated_startDateUtc() {
        return this.startDateUtc;
    }

    /* renamed from: -deprecated_subject  reason: not valid java name */
    public final String m124972deprecated_subject() {
        return this.subject;
    }

    /* renamed from: -deprecated_title  reason: not valid java name */
    public final String m124973deprecated_title() {
        return this.title;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final String m124974deprecated_url() {
        return this.url;
    }

    /* renamed from: -dirty  reason: not valid java name */
    public final void m124975dirty(boolean z) {
        this.dirty = z;
    }

    /* renamed from: -messageHash  reason: not valid java name */
    public final String m124977messageHash() {
        return this.messageHash;
    }

    /* renamed from: -read  reason: not valid java name */
    public final void m124978read(boolean z) {
        this.read = z;
    }

    /* renamed from: -requestId  reason: not valid java name */
    public final String m124979requestId() {
        return this.requestId;
    }

    /* renamed from: -viewCount  reason: not valid java name */
    public final int m124980viewCount() {
        return this.viewCount;
    }

    public final String alert() {
        return this.alert;
    }

    public final String component1() {
        return this.f33812id;
    }

    public final Date component10() {
        return this.endDateUtc;
    }

    public final Date component11() {
        return this.sendDateUtc;
    }

    public final String component12() {
        return this.url;
    }

    public final String component13() {
        return this.custom;
    }

    public final Map<String, String> component14() {
        return this.customKeys;
    }

    public final int component15$sdk_release() {
        return this.viewCount;
    }

    public final String component2$sdk_release() {
        return this.requestId;
    }

    public final String component3$sdk_release() {
        return this.messageHash;
    }

    public final String component4() {
        return this.subject;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.alert;
    }

    public final String component7() {
        return this.sound;
    }

    public final Media component8() {
        return this.media;
    }

    public final Date component9() {
        return this.startDateUtc;
    }

    public final InboxMessage copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Media media2, Date date, Date date2, Date date3, String str8, String str9, Map<String, String> map, int i) {
        String str10 = str;
        C41536l.m120489i(str10, "id");
        String str11 = str8;
        C41536l.m120489i(str11, C11769i.C11770a.f34149l);
        return new InboxMessage(str10, str2, str3, str4, str5, str6, str7, media2, date, date2, date3, str11, str9, map, i);
    }

    public final String custom() {
        return this.custom;
    }

    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    public final boolean deleted() {
        return this.deleted;
    }

    public final Date endDateUtc() {
        return this.endDateUtc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxMessage)) {
            return false;
        }
        InboxMessage inboxMessage = (InboxMessage) obj;
        return C41536l.m120484d(this.f33812id, inboxMessage.f33812id) && C41536l.m120484d(this.requestId, inboxMessage.requestId) && C41536l.m120484d(this.messageHash, inboxMessage.messageHash) && C41536l.m120484d(this.subject, inboxMessage.subject) && C41536l.m120484d(this.title, inboxMessage.title) && C41536l.m120484d(this.alert, inboxMessage.alert) && C41536l.m120484d(this.sound, inboxMessage.sound) && C41536l.m120484d(this.media, inboxMessage.media) && C41536l.m120484d(this.startDateUtc, inboxMessage.startDateUtc) && C41536l.m120484d(this.endDateUtc, inboxMessage.endDateUtc) && C41536l.m120484d(this.sendDateUtc, inboxMessage.sendDateUtc) && C41536l.m120484d(this.url, inboxMessage.url) && C41536l.m120484d(this.custom, inboxMessage.custom) && C41536l.m120484d(this.customKeys, inboxMessage.customKeys) && this.viewCount == inboxMessage.viewCount;
    }

    public int hashCode() {
        int hashCode = this.f33812id.hashCode() * 31;
        String str = this.requestId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageHash;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subject;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alert;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sound;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Media media2 = this.media;
        int hashCode8 = (hashCode7 + (media2 == null ? 0 : media2.hashCode())) * 31;
        Date date = this.startDateUtc;
        int hashCode9 = (hashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int hashCode10 = (hashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.sendDateUtc;
        int hashCode11 = (((hashCode10 + (date3 == null ? 0 : date3.hashCode())) * 31) + this.url.hashCode()) * 31;
        String str7 = this.custom;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.customKeys;
        if (map != null) {
            i = map.hashCode();
        }
        return ((hashCode12 + i) * 31) + this.viewCount;
    }

    /* renamed from: id */
    public final String mo30788id() {
        return this.f33812id;
    }

    public final Media media() {
        return this.media;
    }

    public final boolean read() {
        return this.read;
    }

    public final Date sendDateUtc() {
        return this.sendDateUtc;
    }

    public final String sound() {
        return this.sound;
    }

    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    public final String subject() {
        return this.subject;
    }

    public final String title() {
        return this.title;
    }

    public final JSONObject toJson$sdk_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", mo30788id());
        if (m124977messageHash() != null) {
            jSONObject.put("hash", m124977messageHash());
        }
        if (m124979requestId() != null) {
            jSONObject.put("requestId", m124979requestId());
        }
        if (subject() != null) {
            jSONObject.put("subject", subject());
        }
        if (title() != null) {
            jSONObject.put("title", title());
        }
        if (alert() != null) {
            jSONObject.put("alert", alert());
        }
        if (sound() != null) {
            jSONObject.put("sound", sound());
        }
        if (media() != null) {
            jSONObject.put("media", C11668b.m42589a(media()));
        }
        if (startDateUtc() != null) {
            jSONObject.put("startDateUtc", C11516m.m42082a(startDateUtc()));
        }
        if (endDateUtc() != null) {
            jSONObject.put("endDateUtc", C11516m.m42082a(endDateUtc()));
        }
        if (sendDateUtc() != null) {
            jSONObject.put("sendDateUtc", C11516m.m42082a(sendDateUtc()));
        }
        jSONObject.put(C11769i.C11770a.f34149l, url());
        if (custom() != null) {
            jSONObject.put(C11769i.C11770a.f34150m, custom());
        }
        if (customKeys() != null) {
            jSONObject.put(C11769i.C11770a.f34151n, C11516m.m42086a(customKeys()));
        }
        jSONObject.put("viewCount", m124980viewCount());
        return jSONObject;
    }

    public final String toJsonString() {
        String jSONObject = toJson$sdk_release().toString(2);
        C41536l.m120488h(jSONObject, "toJson().toString(2)");
        return jSONObject;
    }

    public String toString() {
        return "InboxMessage(id=" + this.f33812id + ", requestId=" + this.requestId + ", messageHash=" + this.messageHash + ", subject=" + this.subject + ", title=" + this.title + ", alert=" + this.alert + ", sound=" + this.sound + ", media=" + this.media + ", startDateUtc=" + this.startDateUtc + ", endDateUtc=" + this.endDateUtc + ", sendDateUtc=" + this.sendDateUtc + ", url=" + this.url + ", custom=" + this.custom + ", customKeys=" + this.customKeys + ", viewCount=" + this.viewCount + ')';
    }

    public final String url() {
        return this.url;
    }

    public InboxMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, Media media2, Date date, Date date2, Date date3, String str8, String str9, Map<String, String> map, int i) {
        String str10 = str8;
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str10, C11769i.C11770a.f34149l);
        this.f33812id = str;
        this.requestId = str2;
        this.messageHash = str3;
        this.subject = str4;
        this.title = str5;
        this.alert = str6;
        this.sound = str7;
        this.media = media2;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.sendDateUtc = date3;
        this.url = str10;
        this.custom = str9;
        this.customKeys = map;
        this.viewCount = i;
    }

    /* renamed from: -dirty  reason: not valid java name */
    public final boolean m124976dirty() {
        return this.dirty;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InboxMessage(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, com.salesforce.marketingcloud.messages.inbox.InboxMessage.Media r27, java.util.Date r28, java.util.Date r29, java.util.Date r30, java.lang.String r31, java.lang.String r32, java.util.Map r33, int r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r21
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r22
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r23
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r24
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r25
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r26
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r27
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r28
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r29
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r30
        L_0x0053:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r32
        L_0x005c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0063
            r17 = r2
            goto L_0x0065
        L_0x0063:
            r17 = r33
        L_0x0065:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x006d
            r0 = 0
            r18 = r0
            goto L_0x006f
        L_0x006d:
            r18 = r34
        L_0x006f:
            r3 = r19
            r4 = r20
            r15 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.InboxMessage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.salesforce.marketingcloud.messages.inbox.InboxMessage$Media, java.util.Date, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InboxMessage(org.json.JSONObject r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "hash"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"hash\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r5 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "requestId"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"requestId\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r4 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "subject"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"subject\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r6 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "title"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"title\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r7 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "alert"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"alert\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r8 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "sound"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"sound\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r9 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "media"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0072
            r10 = r2
            goto L_0x0077
        L_0x0072:
            com.salesforce.marketingcloud.messages.inbox.InboxMessage$Media r1 = com.salesforce.marketingcloud.messages.inbox.C11668b.m42588a((org.json.JSONObject) r1)
            r10 = r1
        L_0x0077:
            java.lang.String r1 = "startDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r11 = "json.optString(\"startDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r11)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x008a
            r1 = r2
            goto L_0x008e
        L_0x008a:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
        L_0x008e:
            if (r1 != 0) goto L_0x0095
            java.util.Date r1 = new java.util.Date
            r1.<init>()
        L_0x0095:
            r11 = r1
            java.lang.String r1 = "endDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r12 = "json.optString(\"endDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r12)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00a9
            r12 = r2
            goto L_0x00ae
        L_0x00a9:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r12 = r1
        L_0x00ae:
            java.lang.String r1 = "sendDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r13 = "json.optString(\"sendDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r13)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00c1
            r13 = r2
            goto L_0x00c6
        L_0x00c1:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r13 = r1
        L_0x00c6:
            java.lang.String r1 = "url"
            java.lang.String r14 = r0.getString(r1)
            java.lang.String r1 = "custom"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r15 = "json.optString(\"custom\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r15)
            java.lang.String r15 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "keys"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 != 0) goto L_0x00e6
            r16 = r2
            goto L_0x00ec
        L_0x00e6:
            java.util.Map r1 = com.salesforce.marketingcloud.internal.C11516m.m42089b((org.json.JSONArray) r1)
            r16 = r1
        L_0x00ec:
            java.lang.String r1 = "viewCount"
            r2 = 0
            int r17 = r0.optInt(r1, r2)
            java.lang.String r0 = "getString(\"id\")"
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)
            java.lang.String r0 = "getString(\"url\")"
            kotlin.jvm.internal.C41536l.m120488h(r14, r0)
            r2 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.InboxMessage.<init>(org.json.JSONObject):void");
    }
}

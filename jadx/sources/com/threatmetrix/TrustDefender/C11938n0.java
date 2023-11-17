package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p626ue.C18114a;

/* renamed from: com.threatmetrix.TrustDefender.n0 */
public class C11938n0 {

    /* renamed from: C */
    private static final String f35015C = C11907h.m43615j(C11938n0.class);

    /* renamed from: D */
    private static final String f35016D = C18114a.m62170f("Gqxri&{ip*n{{\u0003t~\u00062\t\u0003z\u000f\b}|\u000f\u0001\u0001\n\u0018Y@", 'x', 246, 2);

    /* renamed from: E */
    private static final String f35017E = C18114a.m62170f("(RYSJ\u0007[]K]`\rR^Sf_Xbi\u0016kY`\u001apjbvoedvhhq", 159, '>', 2);

    /* renamed from: F */
    private static final String f35018F = C18114a.m62167c("5_f`W\u0014jd\\pi_^pbb\u001fewgqx%z\u0001xnD+", 237, 0);

    /* renamed from: A */
    public final List f35019A = new ArrayList();

    /* renamed from: B */
    public HashSet f35020B = null;

    /* renamed from: a */
    public boolean f35021a = false;

    /* renamed from: b */
    public long f35022b = 0;

    /* renamed from: c */
    public long f35023c = 0;

    /* renamed from: d */
    public int f35024d = 0;

    /* renamed from: e */
    public int f35025e = 0;

    /* renamed from: f */
    public int f35026f = 0;

    /* renamed from: g */
    public int f35027g = 0;

    /* renamed from: h */
    public int f35028h = 0;

    /* renamed from: i */
    public int f35029i = 0;

    /* renamed from: j */
    public int f35030j = 0;

    /* renamed from: k */
    public int f35031k = 0;

    /* renamed from: l */
    public int f35032l = 0;

    /* renamed from: m */
    public int f35033m = 0;

    /* renamed from: n */
    public int f35034n = 0;

    /* renamed from: o */
    public int f35035o = 0;

    /* renamed from: p */
    public int f35036p = 0;

    /* renamed from: q */
    public int f35037q = 0;

    /* renamed from: r */
    public int f35038r = 0;

    /* renamed from: s */
    public int f35039s = 0;

    /* renamed from: t */
    public String f35040t = "";

    /* renamed from: u */
    public String f35041u = "";

    /* renamed from: v */
    public String f35042v = "";

    /* renamed from: w */
    public String f35043w = "";

    /* renamed from: x */
    public String f35044x = "";

    /* renamed from: y */
    public final List f35045y = new ArrayList();

    /* renamed from: z */
    public final List f35046z = new ArrayList();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r10.equals(p626ue.C18114a.m62170f("DB7", 156, 171, 2)) != false) goto L_0x01c8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m43814a(java.lang.String r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.hashCode()
            r1 = 22
            r2 = 13
            r3 = 5
            r4 = 2
            r5 = 4
            r6 = 1
            r7 = 3
            r8 = 0
            switch(r0) {
                case 68: goto L_0x01b7;
                case 78: goto L_0x01a5;
                case 79: goto L_0x0193;
                case 81: goto L_0x0181;
                case 83: goto L_0x0173;
                case 119: goto L_0x0161;
                case 2651: goto L_0x0150;
                case 2653: goto L_0x013d;
                case 65540: goto L_0x012b;
                case 65542: goto L_0x0117;
                case 65545: goto L_0x0106;
                case 65552: goto L_0x00f4;
                case 65554: goto L_0x00e0;
                case 65555: goto L_0x00cc;
                case 65556: goto L_0x00b8;
                case 81863: goto L_0x00a8;
                case 82311: goto L_0x0096;
                case 83861: goto L_0x0084;
                case 83866: goto L_0x0072;
                case 83873: goto L_0x0060;
                case 83875: goto L_0x004c;
                case 83876: goto L_0x003a;
                case 2031979: goto L_0x0028;
                case 2600270: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x01c7
        L_0x0016:
            java.lang.String r0 = "`Paa"
            r1 = 46
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r6)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 11
            goto L_0x01c8
        L_0x0028:
            java.lang.String r0 = "#\"(2"
            r1 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r3)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 14
            goto L_0x01c8
        L_0x003a:
            java.lang.String r0 = "D2@"
            r1 = 199(0xc7, float:2.79E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r5)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 21
            goto L_0x01c8
        L_0x004c:
            r0 = 254(0xfe, float:3.56E-43)
            r1 = 118(0x76, float:1.65E-43)
            java.lang.String r2 = "L:G"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 20
            goto L_0x01c8
        L_0x0060:
            java.lang.String r0 = "eS^"
            r1 = 238(0xee, float:3.34E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r3)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 10
            goto L_0x01c8
        L_0x0072:
            java.lang.String r0 = "\u0015\u0005\u000b"
            r1 = 148(0x94, float:2.07E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r6)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 9
            goto L_0x01c8
        L_0x0084:
            java.lang.String r0 = "p^]"
            r1 = 50
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r5)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 8
            goto L_0x01c8
        L_0x0096:
            r0 = 156(0x9c, float:2.19E-43)
            r2 = 171(0xab, float:2.4E-43)
            java.lang.String r3 = "DB7"
            java.lang.String r0 = p626ue.C18114a.m62170f(r3, r0, r2, r4)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            goto L_0x01c8
        L_0x00a8:
            java.lang.String r0 = "iXm"
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 23
            goto L_0x01c8
        L_0x00b8:
            r0 = 252(0xfc, float:3.53E-43)
            r1 = 212(0xd4, float:2.97E-43)
            java.lang.String r2 = "\u0016\u0017*"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 16
            goto L_0x01c8
        L_0x00cc:
            r0 = 62
            r1 = 91
            java.lang.String r2 = "_^n"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 19
            goto L_0x01c8
        L_0x00e0:
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 194(0xc2, float:2.72E-43)
            java.lang.String r2 = "IHW"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r6)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 18
            goto L_0x01c8
        L_0x00f4:
            java.lang.String r0 = "\u0016\u0017&"
            r1 = 70
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r6)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 15
            goto L_0x01c8
        L_0x0106:
            java.lang.String r0 = ":;C"
            r1 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r2
            goto L_0x01c8
        L_0x0117:
            r0 = 185(0xb9, float:2.59E-43)
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r2 = "56;"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 17
            goto L_0x01c8
        L_0x012b:
            java.lang.String r0 = "\u0006\u0007\n"
            r1 = 67
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 12
            goto L_0x01c8
        L_0x013d:
            r0 = 224(0xe0, float:3.14E-43)
            r1 = 190(0xbe, float:2.66E-43)
            java.lang.String r2 = "1-"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r8)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 7
            goto L_0x01c8
        L_0x0150:
            java.lang.String r0 = "c_"
            r1 = 217(0xd9, float:3.04E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r6)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = 6
            goto L_0x01c8
        L_0x0161:
            r0 = 150(0x96, float:2.1E-43)
            r1 = 115(0x73, float:1.61E-43)
            java.lang.String r2 = "\u0003"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r8
            goto L_0x01c8
        L_0x0173:
            java.lang.String r0 = "9"
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r2, r5)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r3
            goto L_0x01c8
        L_0x0181:
            r0 = 182(0xb6, float:2.55E-43)
            r1 = 244(0xf4, float:3.42E-43)
            java.lang.String r2 = "~"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r7
            goto L_0x01c8
        L_0x0193:
            r0 = 99
            r1 = 247(0xf7, float:3.46E-43)
            java.lang.String r2 = ","
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r6
            goto L_0x01c8
        L_0x01a5:
            r0 = 174(0xae, float:2.44E-43)
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r2 = "G"
            java.lang.String r0 = p626ue.C18114a.m62170f(r2, r0, r1, r7)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r5
            goto L_0x01c8
        L_0x01b7:
            java.lang.String r0 = ">"
            r1 = 129(0x81, float:1.81E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r0, r1, r4)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01c7
            r1 = r4
            goto L_0x01c8
        L_0x01c7:
            r1 = -1
        L_0x01c8:
            switch(r1) {
                case 0: goto L_0x02ca;
                case 1: goto L_0x02bf;
                case 2: goto L_0x02b4;
                case 3: goto L_0x02a9;
                case 4: goto L_0x02a2;
                case 5: goto L_0x029b;
                case 6: goto L_0x0294;
                case 7: goto L_0x0289;
                case 8: goto L_0x027e;
                case 9: goto L_0x0273;
                case 10: goto L_0x0268;
                case 11: goto L_0x025d;
                case 12: goto L_0x0251;
                case 13: goto L_0x0245;
                case 14: goto L_0x0239;
                case 15: goto L_0x022d;
                case 16: goto L_0x0221;
                case 17: goto L_0x0215;
                case 18: goto L_0x0209;
                case 19: goto L_0x01fd;
                case 20: goto L_0x01f1;
                case 21: goto L_0x01e5;
                case 22: goto L_0x01dd;
                case 23: goto L_0x01cd;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            goto L_0x02d0
        L_0x01cd:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            if (r10 <= 0) goto L_0x01d8
            goto L_0x01d9
        L_0x01d8:
            r6 = r8
        L_0x01d9:
            r9.f35021a = r6
            goto L_0x02d0
        L_0x01dd:
            java.lang.String r10 = r11.getText()
            r9.f35044x = r10
            goto L_0x02d0
        L_0x01e5:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35038r = r10
            goto L_0x02d0
        L_0x01f1:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35037q = r10
            goto L_0x02d0
        L_0x01fd:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35036p = r10
            goto L_0x02d0
        L_0x0209:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35035o = r10
            goto L_0x02d0
        L_0x0215:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35034n = r10
            goto L_0x02d0
        L_0x0221:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35033m = r10
            goto L_0x02d0
        L_0x022d:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35032l = r10
            goto L_0x02d0
        L_0x0239:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35039s = r10
            goto L_0x02d0
        L_0x0245:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35031k = r10
            goto L_0x02d0
        L_0x0251:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35030j = r10
            goto L_0x02d0
        L_0x025d:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35029i = r10
            goto L_0x02d0
        L_0x0268:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35028h = r10
            goto L_0x02d0
        L_0x0273:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35027g = r10
            goto L_0x02d0
        L_0x027e:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35026f = r10
            goto L_0x02d0
        L_0x0289:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35025e = r10
            goto L_0x02d0
        L_0x0294:
            java.lang.String r10 = r11.getText()
            r9.f35042v = r10
            goto L_0x02d0
        L_0x029b:
            java.lang.String r10 = r11.getText()
            r9.f35043w = r10
            goto L_0x02d0
        L_0x02a2:
            java.lang.String r10 = r11.getText()
            r9.f35041u = r10
            goto L_0x02d0
        L_0x02a9:
            java.lang.String r10 = r11.getText()
            int r10 = java.lang.Integer.parseInt(r10)
            r9.f35024d = r10
            goto L_0x02d0
        L_0x02b4:
            java.lang.String r10 = r11.getText()
            long r10 = java.lang.Long.parseLong(r10)
            r9.f35023c = r10
            goto L_0x02d0
        L_0x02bf:
            java.lang.String r10 = r11.getText()
            long r10 = java.lang.Long.parseLong(r10)
            r9.f35022b = r10
            goto L_0x02d0
        L_0x02ca:
            java.lang.String r10 = r11.getText()
            r9.f35040t = r10
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11938n0.m43814a(java.lang.String, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: c */
    private void m43815c(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        int next = xmlPullParser.next();
        this.f35020B = new HashSet();
        String str3 = "";
        while (next != 1) {
            if (next != 0) {
                if (next == 2) {
                    str3 = xmlPullParser.getName();
                } else if (next != 3) {
                    if (next != 4) {
                        C11907h.C11908a.m43624b(f35015C, C18114a.m62167c("Cmtne\"xrj~wml~pp-s\u0006u\u00073\t\u000f\u0007|R9", 253, 1) + next);
                    } else if (str3 != null) {
                        if (str3.equals(C18114a.m62167c("s", 226, 1))) {
                            this.f35020B.add(xmlPullParser.getText());
                        } else {
                            str2 = f35015C;
                            str = C18114a.m62167c("T~\u0006v3\tv}7{\t\t\u0010\u0002\f\u0013?\u0016\u0010\b\u001c\u0015\u000b\n\u001c\u000e\u000e\u0017%fM", 174, 1) + str3;
                        }
                    }
                } else if (xmlPullParser.getName().equals(C18114a.m62167c("1<", 'q', 3))) {
                    return;
                }
                next = xmlPullParser.next();
            } else {
                str2 = f35015C;
                str = C18114a.m62167c("$LQI>xKK7GHr6@3D;2:?i=).e:2(:1%\"2\" '3", 223, 2);
            }
            C11907h.C11908a.m43630h(str2, str);
            next = xmlPullParser.next();
        }
    }

    /* renamed from: d */
    private void m43816d(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        String str = "";
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 0) {
                C11907h.C11908a.m43630h(f35015C, C18114a.m62167c("T|\u0002yn){{gwx#fpctkbjo\u001amY^\u0016jbXjaURbRPWc", 'P', 2));
            } else if (next == 2) {
                str = xmlPullParser.getName();
            } else if (next != 3) {
                if (next != 4) {
                    C11907h.m43607b(f35015C, C18114a.m62167c("Lv}wn+\u0002{s\b\u0001vu\byy6|\u000f~\t\u0010<\u0012\u0018\u0010\u0006[B", 2, 1) + next);
                } else if (str != null) {
                    if (str.equals(C18114a.m62170f("\u0015", 128, ':', 1))) {
                        String text = xmlPullParser.getText();
                        if (text.indexOf(46) < 0) {
                            text = C18114a.m62167c("JVKXTMG\u0010QEQKFONCHF\u0005", 202, 4) + text;
                        }
                        arrayList.add(text);
                    } else {
                        C11907h.C11908a.m43624b(f35015C, C18114a.m62170f("t\u001f& \u0017S)\u0017\u001eW\u001c))0\",3_60(<5+*<..7E\u0007m", '2', 4, 2) + str);
                    }
                }
            } else if (xmlPullParser.getName().equals(C18114a.m62167c("gn", 179, 4))) {
                return;
            }
        }
    }

    /* renamed from: e */
    public static String m43817e(InputStream inputStream, String str, String str2) {
        if (inputStream == null) {
            return null;
        }
        return C12003w.m44099c(m43822k(inputStream), str, str2);
    }

    /* renamed from: f */
    private void m43818f(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        int next = xmlPullParser.next();
        String str3 = "";
        while (next != 1) {
            if (next != 0) {
                if (next == 2) {
                    str3 = xmlPullParser.getName();
                } else if (next != 3) {
                    if (next != 4) {
                        C11907h.C11908a.m43624b(f35015C, C18114a.m62167c("T~\u0006v3\n\u0004{\u0010\t~}\u0010\u0002\u0002>\u0005\u0017\u0007\u0011\u0018D\u001a \u0018\u000ecJ", 134, 3) + next);
                    } else if (str3 != null) {
                        if (str3.equals(C18114a.m62170f(">?E", '2', 'G', 3))) {
                            this.f35019A.add(xmlPullParser.getText());
                        } else {
                            str2 = f35015C;
                            str = C18114a.m62167c("\r5:2'a5!&] +).\u001e&+U*\"\u0018*!\u0015\u0012\"\u0012\u0010\u0017#bG", 184, 5) + str3;
                        }
                    }
                } else if (xmlPullParser.getName().equals(C18114a.m62170f("LKR", 181, 192, 1))) {
                    return;
                }
                next = xmlPullParser.next();
            } else {
                str2 = f35015C;
                str = C18114a.m62170f("i\u0014\u001b\u0015\fH\u001d\u001f\r\u001f\"N\u0014 \u0015(!\u001a$+W-\u001b\"[2,$81'&8**3A", 245, 210, 2);
            }
            C11907h.C11908a.m43630h(str2, str);
            next = xmlPullParser.next();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m43819g(org.xmlpull.v1.XmlPullParser r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getName()
            int r1 = r0.hashCode()
            r2 = 2216(0x8a8, float:3.105E-42)
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 3
            r7 = 1
            if (r1 == r2) goto L_0x0067
            r2 = 2474(0x9aa, float:3.467E-42)
            if (r1 == r2) goto L_0x0057
            r2 = 2563(0xa03, float:3.592E-42)
            if (r1 == r2) goto L_0x0045
            r2 = 2568(0xa08, float:3.599E-42)
            if (r1 == r2) goto L_0x0035
            r2 = 67532(0x107cc, float:9.4632E-41)
            if (r1 == r2) goto L_0x0023
            goto L_0x0079
        L_0x0023:
            r1 = 48
            r2 = 104(0x68, float:1.46E-43)
            java.lang.String r8 = "]^g"
            java.lang.String r1 = p626ue.C18114a.m62170f(r8, r1, r2, r6)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            r0 = r4
            goto L_0x007a
        L_0x0035:
            java.lang.String r1 = "\u0001\n"
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.String r1 = p626ue.C18114a.m62167c(r1, r2, r7)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            r0 = r7
            goto L_0x007a
        L_0x0045:
            r1 = 60
            r2 = 64
            java.lang.String r8 = "SU"
            java.lang.String r1 = p626ue.C18114a.m62170f(r8, r1, r2, r7)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            r0 = r3
            goto L_0x007a
        L_0x0057:
            java.lang.String r1 = "NY"
            r2 = 212(0xd4, float:2.97E-43)
            java.lang.String r1 = p626ue.C18114a.m62167c(r1, r2, r7)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            r0 = r5
            goto L_0x007a
        L_0x0067:
            r1 = 63
            r2 = 249(0xf9, float:3.49E-43)
            java.lang.String r8 = "\u000b\u0012"
            java.lang.String r1 = p626ue.C18114a.m62170f(r8, r1, r2, r7)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            r0 = r6
            goto L_0x007a
        L_0x0079:
            r0 = -1
        L_0x007a:
            if (r0 == 0) goto L_0x0095
            if (r0 == r7) goto L_0x0091
            if (r0 == r5) goto L_0x008d
            if (r0 == r6) goto L_0x0089
            if (r0 == r4) goto L_0x0085
            return r3
        L_0x0085:
            r9.m43818f(r10)
            goto L_0x0098
        L_0x0089:
            r9.m43820i(r10)
            goto L_0x0098
        L_0x008d:
            r9.m43815c(r10)
            goto L_0x0098
        L_0x0091:
            r9.m43816d(r10)
            goto L_0x0098
        L_0x0095:
            r9.m43821j(r10)
        L_0x0098:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11938n0.m43819g(org.xmlpull.v1.XmlPullParser):boolean");
    }

    /* renamed from: i */
    private void m43820i(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        int next = xmlPullParser.next();
        String str3 = "";
        while (next != 1) {
            if (next != 0) {
                if (next == 2) {
                    str3 = xmlPullParser.getName();
                } else if (next != 3) {
                    if (next != 4) {
                        C11907h.m43607b(f35015C, C18114a.m62167c("Hpumb\u001dqi_qh\\YiYW\u0012VfT\\a\f_cYM!\u0006", 211, 2) + next);
                    } else if (str3 != null) {
                        if (str3.equals(C18114a.m62170f("<", 13, 4, 1))) {
                            this.f35046z.add(xmlPullParser.getText());
                        } else {
                            str2 = f35015C;
                            str = C18114a.m62167c("4\\aYN\t\\HM\u0005GRPUEMR|QI?QH<9I97>J\nn", 145, 5) + str3;
                        }
                    }
                } else if (xmlPullParser.getName().equals(C18114a.m62167c("\b\u000f", 'i', 2))) {
                    return;
                }
                next = xmlPullParser.next();
            } else {
                str2 = f35015C;
                str = C18114a.m62167c("\\\u0005\n\u0002v1\u0004\u0004o\u0001+nxk|sjrw\"uaf\u001erj`ri]ZjZX_k", '#', 2);
            }
            C11907h.C11908a.m43630h(str2, str);
            next = xmlPullParser.next();
        }
    }

    /* renamed from: j */
    private void m43821j(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        int next = xmlPullParser.next();
        String str3 = "";
        while (next != 1) {
            if (next != 0) {
                if (next == 2) {
                    str3 = xmlPullParser.getName();
                } else if (next != 3) {
                    if (next != 4) {
                        C11907h.C11908a.m43624b(f35015C, C18114a.m62167c("w\")#\u001aV-'\u001f3,\"!3%%a(:*4;g=C;1\u0007m", 215, 3) + next);
                    } else if (str3 != null) {
                        if (str3.equals(C18114a.m62167c(" ", 206, 0))) {
                            this.f35045y.add(xmlPullParser.getText());
                        } else {
                            str2 = f35015C;
                            str = C18114a.m62170f("w %\u001d\u0012L \f\u0011H\u000b\u0016\u0014\u0019\t\u0011\u0016@\u0015\r\u0003\u0015\f|\r|z\u0002\u000eM2", 206, 1, 0) + str3;
                        }
                    }
                } else if (xmlPullParser.getName().equals(C18114a.m62170f("}\u0002", 'G', 228, 3))) {
                    return;
                }
                next = xmlPullParser.next();
            } else {
                str2 = f35015C;
                str = C18114a.m62167c("{&-'\u001eZ/1\u001f14`&2':3,6=i?-4mD>6JC98J<<ES", '<', 1);
            }
            C11907h.C11908a.m43630h(str2, str);
            next = xmlPullParser.next();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        throw r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m43822k(java.io.InputStream r7) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0048 }
            r1.<init>()     // Catch:{ IOException -> 0x0048 }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003c }
            r3 = 0
        L_0x000c:
            int r5 = r7.read(r2)     // Catch:{ all -> 0x003c }
            r6 = -1
            if (r5 == r6) goto L_0x0034
            r6 = 0
            r1.write(r2, r6, r5)     // Catch:{ all -> 0x003c }
            long r5 = (long) r5     // Catch:{ all -> 0x003c }
            long r3 = r3 + r5
            r5 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x000c
            java.lang.String r7 = f35015C     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "CVl\u0013XZ\\T\u000e`UeO\tZLGHLHF"
            r3 = 19
            r4 = 1
            r5 = 118(0x76, float:1.65E-43)
            java.lang.String r2 = p626ue.C18114a.m62170f(r2, r5, r3, r4)     // Catch:{ all -> 0x003c }
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r7, r2)     // Catch:{ all -> 0x003c }
            r1.close()     // Catch:{ IOException -> 0x0048 }
            return r0
        L_0x0034:
            byte[] r7 = r1.toByteArray()     // Catch:{ all -> 0x003c }
            r1.close()     // Catch:{ IOException -> 0x0048 }
            return r7
        L_0x003c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x003e }
        L_0x003e:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r1 = move-exception
            r7.addSuppressed(r1)     // Catch:{ IOException -> 0x0048 }
        L_0x0047:
            throw r2     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11938n0.m43822k(java.io.InputStream):byte[]");
    }

    /* renamed from: b */
    public void mo31991b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(new InputStreamReader(inputStream));
                String str = null;
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            str = null;
                        } else if (eventType == 4) {
                            m43814a(str, newPullParser);
                        }
                    } else if (!m43819g(newPullParser)) {
                        str = newPullParser.getName();
                    }
                }
            } catch (InterruptedIOException unused) {
                throw new InterruptedIOException();
            } catch (IOException e) {
                C11907h.C11908a.m43629g(f35015C, C18114a.m62170f("\u0003\bW{('#%", 'Q', 't', 1), e);
            } catch (XmlPullParserException e2) {
                C11907h.m43619n(f35015C, C18114a.m62167c("\u000e\u0004\u0004X\n\u001c.0#^\u00053426", 187, 1), e2);
            }
        }
    }

    /* renamed from: h */
    public boolean mo31992h() {
        String str = this.f35040t;
        return str != null && !str.isEmpty();
    }

    /* renamed from: l */
    public void mo31993l(InputStream inputStream, String str, String str2) {
        String e = m43817e(inputStream, str, str2);
        if (e != null) {
            mo31991b(new ByteArrayInputStream(e.getBytes(StandardCharsets.UTF_8)));
        }
    }
}

package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0303j;
import androidx.appcompat.widget.C0483r1;
import androidx.appcompat.widget.C0485s0;
import androidx.core.view.C1111b;
import androidx.core.view.C1235s0;
import com.salesforce.marketingcloud.C11398b;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p030c.C2219j;
import p279v.C8681a;

/* renamed from: androidx.appcompat.view.g */
public class C0272g extends MenuInflater {

    /* renamed from: e */
    static final Class[] f1415e;

    /* renamed from: f */
    static final Class[] f1416f;

    /* renamed from: a */
    final Object[] f1417a;

    /* renamed from: b */
    final Object[] f1418b;

    /* renamed from: c */
    Context f1419c;

    /* renamed from: d */
    private Object f1420d;

    /* renamed from: androidx.appcompat.view.g$a */
    private static class C0273a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class[] f1421c = {MenuItem.class};

        /* renamed from: a */
        private Object f1422a;

        /* renamed from: b */
        private Method f1423b;

        public C0273a(Object obj, String str) {
            this.f1422a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1423b = cls.getMethod(str, f1421c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1423b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1423b.invoke(this.f1422a, new Object[]{menuItem})).booleanValue();
                }
                this.f1423b.invoke(this.f1422a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.g$b */
    private class C0274b {

        /* renamed from: A */
        C1111b f1424A;

        /* renamed from: B */
        private CharSequence f1425B;

        /* renamed from: C */
        private CharSequence f1426C;

        /* renamed from: D */
        private ColorStateList f1427D = null;

        /* renamed from: E */
        private PorterDuff.Mode f1428E = null;

        /* renamed from: a */
        private Menu f1430a;

        /* renamed from: b */
        private int f1431b;

        /* renamed from: c */
        private int f1432c;

        /* renamed from: d */
        private int f1433d;

        /* renamed from: e */
        private int f1434e;

        /* renamed from: f */
        private boolean f1435f;

        /* renamed from: g */
        private boolean f1436g;

        /* renamed from: h */
        private boolean f1437h;

        /* renamed from: i */
        private int f1438i;

        /* renamed from: j */
        private int f1439j;

        /* renamed from: k */
        private CharSequence f1440k;

        /* renamed from: l */
        private CharSequence f1441l;

        /* renamed from: m */
        private int f1442m;

        /* renamed from: n */
        private char f1443n;

        /* renamed from: o */
        private int f1444o;

        /* renamed from: p */
        private char f1445p;

        /* renamed from: q */
        private int f1446q;

        /* renamed from: r */
        private int f1447r;

        /* renamed from: s */
        private boolean f1448s;

        /* renamed from: t */
        private boolean f1449t;

        /* renamed from: u */
        private boolean f1450u;

        /* renamed from: v */
        private int f1451v;

        /* renamed from: w */
        private int f1452w;

        /* renamed from: x */
        private String f1453x;

        /* renamed from: y */
        private String f1454y;

        /* renamed from: z */
        private String f1455z;

        public C0274b(Menu menu) {
            this.f1430a = menu;
            mo778h();
        }

        /* renamed from: c */
        private char m942c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private Object m943e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0272g.this.f1419c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m944i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f1448s).setVisible(this.f1449t).setEnabled(this.f1450u);
            boolean z2 = false;
            if (this.f1447r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f1441l).setIcon(this.f1442m);
            int i = this.f1451v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f1455z != null) {
                if (!C0272g.this.f1419c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0273a(C0272g.this.mo770b(), this.f1455z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f1447r >= 2) {
                if (menuItem instanceof C0301i) {
                    ((C0301i) menuItem).mo1099t(true);
                } else if (menuItem instanceof C0303j) {
                    ((C0303j) menuItem).mo1129h(true);
                }
            }
            String str = this.f1453x;
            if (str != null) {
                menuItem.setActionView((View) m943e(str, C0272g.f1415e, C0272g.this.f1417a));
                z2 = true;
            }
            int i2 = this.f1452w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C1111b bVar = this.f1424A;
            if (bVar != null) {
                C1235s0.m4320b(menuItem, bVar);
            }
            C1235s0.m4322d(menuItem, this.f1425B);
            C1235s0.m4326h(menuItem, this.f1426C);
            C1235s0.m4321c(menuItem, this.f1443n, this.f1444o);
            C1235s0.m4325g(menuItem, this.f1445p, this.f1446q);
            PorterDuff.Mode mode = this.f1428E;
            if (mode != null) {
                C1235s0.m4324f(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1427D;
            if (colorStateList != null) {
                C1235s0.m4323e(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo773a() {
            this.f1437h = true;
            m944i(this.f1430a.add(this.f1431b, this.f1438i, this.f1439j, this.f1440k));
        }

        /* renamed from: b */
        public SubMenu mo774b() {
            this.f1437h = true;
            SubMenu addSubMenu = this.f1430a.addSubMenu(this.f1431b, this.f1438i, this.f1439j, this.f1440k);
            m944i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo775d() {
            return this.f1437h;
        }

        /* renamed from: f */
        public void mo776f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0272g.this.f1419c.obtainStyledAttributes(attributeSet, C2219j.f6862w1);
            this.f1431b = obtainStyledAttributes.getResourceId(C2219j.f6872y1, 0);
            this.f1432c = obtainStyledAttributes.getInt(C2219j.f6622A1, 0);
            this.f1433d = obtainStyledAttributes.getInt(C2219j.f6627B1, 0);
            this.f1434e = obtainStyledAttributes.getInt(C2219j.f6632C1, 0);
            this.f1435f = obtainStyledAttributes.getBoolean(C2219j.f6877z1, true);
            this.f1436g = obtainStyledAttributes.getBoolean(C2219j.f6867x1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo777g(AttributeSet attributeSet) {
            boolean z;
            C0483r1 u = C0483r1.m1945u(C0272g.this.f1419c, attributeSet, C2219j.f6637D1);
            this.f1438i = u.mo2327n(C2219j.f6652G1, 0);
            this.f1439j = (u.mo2324k(C2219j.f6667J1, this.f1432c) & -65536) | (u.mo2324k(C2219j.f6672K1, this.f1433d) & 65535);
            this.f1440k = u.mo2329p(C2219j.f6677L1);
            this.f1441l = u.mo2329p(C2219j.f6682M1);
            this.f1442m = u.mo2327n(C2219j.f6642E1, 0);
            this.f1443n = m942c(u.mo2328o(C2219j.f6687N1));
            this.f1444o = u.mo2324k(C2219j.f6722U1, C11398b.f33143v);
            this.f1445p = m942c(u.mo2328o(C2219j.f6692O1));
            this.f1446q = u.mo2324k(C2219j.f6742Y1, C11398b.f33143v);
            int i = C2219j.f6697P1;
            if (u.mo2332s(i)) {
                this.f1447r = u.mo2314a(i, false) ? 1 : 0;
            } else {
                this.f1447r = this.f1434e;
            }
            this.f1448s = u.mo2314a(C2219j.f6657H1, false);
            this.f1449t = u.mo2314a(C2219j.f6662I1, this.f1435f);
            this.f1450u = u.mo2314a(C2219j.f6647F1, this.f1436g);
            this.f1451v = u.mo2324k(C2219j.f6747Z1, -1);
            this.f1455z = u.mo2328o(C2219j.f6702Q1);
            this.f1452w = u.mo2327n(C2219j.f6707R1, 0);
            this.f1453x = u.mo2328o(C2219j.f6717T1);
            String o = u.mo2328o(C2219j.f6712S1);
            this.f1454y = o;
            if (o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f1452w == 0 && this.f1453x == null) {
                this.f1424A = (C1111b) m943e(o, C0272g.f1416f, C0272g.this.f1418b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1424A = null;
            }
            this.f1425B = u.mo2329p(C2219j.f6727V1);
            this.f1426C = u.mo2329p(C2219j.f6753a2);
            int i2 = C2219j.f6737X1;
            if (u.mo2332s(i2)) {
                this.f1428E = C0485s0.m1971e(u.mo2324k(i2, -1), this.f1428E);
            } else {
                this.f1428E = null;
            }
            int i3 = C2219j.f6732W1;
            if (u.mo2332s(i3)) {
                this.f1427D = u.mo2316c(i3);
            } else {
                this.f1427D = null;
            }
            u.mo2333w();
            this.f1437h = false;
        }

        /* renamed from: h */
        public void mo778h() {
            this.f1431b = 0;
            this.f1432c = 0;
            this.f1433d = 0;
            this.f1434e = 0;
            this.f1435f = true;
            this.f1436g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f1415e = clsArr;
        f1416f = clsArr;
    }

    public C0272g(Context context) {
        super(context);
        this.f1419c = context;
        Object[] objArr = {context};
        this.f1417a = objArr;
        this.f1418b = objArr;
    }

    /* renamed from: a */
    private Object m939a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return m939a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: c */
    private void m940c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0274b bVar = new C0274b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.mo778h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo775d()) {
                                C1111b bVar2 = bVar.f1424A;
                                if (bVar2 == null || !bVar2.mo1163b()) {
                                    bVar.mo773a();
                                } else {
                                    bVar.mo774b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo776f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo777g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m940c(xmlPullParser, attributeSet, bVar.mo774b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo770b() {
        if (this.f1420d == null) {
            this.f1420d = m939a(this.f1419c);
        }
        return this.f1420d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C8681a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1419c.getResources().getLayout(i);
            m940c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}

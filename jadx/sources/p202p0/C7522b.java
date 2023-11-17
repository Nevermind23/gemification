package p202p0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7530c0;
import ue1.C43075l;

@C7530c0.C7532b("activity")
/* renamed from: p0.b */
public class C7522b extends C7530c0 {

    /* renamed from: e */
    public static final C7523a f21962e = new C7523a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final Context f21963c;

    /* renamed from: d */
    private final Activity f21964d;

    /* renamed from: p0.b$a */
    public static final class C7523a {
        private C7523a() {
        }

        public /* synthetic */ C7523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p0.b$b */
    public static class C7524b extends C7589q {

        /* renamed from: o */
        private Intent f21965o;

        /* renamed from: p */
        private String f21966p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7524b(C7530c0 c0Var) {
            super(c0Var);
            C41536l.m120489i(c0Var, "activityNavigator");
        }

        /* renamed from: D */
        public void mo22025D(Context context, AttributeSet attributeSet) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(attributeSet, "attrs");
            super.mo22025D(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7545h0.f21999a);
            C41536l.m120488h(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(C7545h0.f22004f);
            if (string != null) {
                String packageName = context.getPackageName();
                C41536l.m120488h(packageName, "context.packageName");
                string = C40439w.m117103B(string, "${applicationId}", packageName, false, 4, (Object) null);
            }
            mo22035S(string);
            String string2 = obtainAttributes.getString(C7545h0.f22000b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                mo22032O(new ComponentName(context, string2));
            }
            mo22031N(obtainAttributes.getString(C7545h0.f22001c));
            String string3 = obtainAttributes.getString(C7545h0.f22002d);
            if (string3 != null) {
                mo22033P(Uri.parse(string3));
            }
            mo22034R(obtainAttributes.getString(C7545h0.f22003e));
            obtainAttributes.recycle();
        }

        /* renamed from: I */
        public boolean mo22026I() {
            return false;
        }

        /* renamed from: J */
        public final String mo22027J() {
            Intent intent = this.f21965o;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        /* renamed from: K */
        public final ComponentName mo22028K() {
            Intent intent = this.f21965o;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: L */
        public final String mo22029L() {
            return this.f21966p;
        }

        /* renamed from: M */
        public final Intent mo22030M() {
            return this.f21965o;
        }

        /* renamed from: N */
        public final C7524b mo22031N(String str) {
            if (this.f21965o == null) {
                this.f21965o = new Intent();
            }
            Intent intent = this.f21965o;
            C41536l.m120486f(intent);
            intent.setAction(str);
            return this;
        }

        /* renamed from: O */
        public final C7524b mo22032O(ComponentName componentName) {
            if (this.f21965o == null) {
                this.f21965o = new Intent();
            }
            Intent intent = this.f21965o;
            C41536l.m120486f(intent);
            intent.setComponent(componentName);
            return this;
        }

        /* renamed from: P */
        public final C7524b mo22033P(Uri uri) {
            if (this.f21965o == null) {
                this.f21965o = new Intent();
            }
            Intent intent = this.f21965o;
            C41536l.m120486f(intent);
            intent.setData(uri);
            return this;
        }

        /* renamed from: R */
        public final C7524b mo22034R(String str) {
            this.f21966p = str;
            return this;
        }

        /* renamed from: S */
        public final C7524b mo22035S(String str) {
            if (this.f21965o == null) {
                this.f21965o = new Intent();
            }
            Intent intent = this.f21965o;
            C41536l.m120486f(intent);
            intent.setPackage(str);
            return this;
        }

        public boolean equals(Object obj) {
            boolean z;
            if (obj == null || !(obj instanceof C7524b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f21965o;
            if (intent != null) {
                z = intent.filterEquals(((C7524b) obj).f21965o);
            } else if (((C7524b) obj).f21965o == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !C41536l.m120484d(this.f21966p, ((C7524b) obj).f21966p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f21965o;
            int i2 = 0;
            if (intent != null) {
                i = intent.filterHashCode();
            } else {
                i = 0;
            }
            int i3 = (hashCode + i) * 31;
            String str = this.f21966p;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            ComponentName K = mo22028K();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (K != null) {
                sb.append(" class=");
                sb.append(K.getClassName());
            } else {
                String J = mo22027J();
                if (J != null) {
                    sb.append(" action=");
                    sb.append(J);
                }
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "sb.toString()");
            return sb2;
        }
    }

    /* renamed from: p0.b$c */
    static final class C7525c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7525c f21967d = new C7525c();

        C7525c() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C41536l.m120489i(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public C7522b(Context context) {
        Object obj;
        C41536l.m120489i(context, "context");
        this.f21963c = context;
        Iterator it = C40349m.m116845f(context, C7525c.f21967d).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f21964d = (Activity) obj;
    }

    /* renamed from: k */
    public boolean mo22022k() {
        Activity activity = this.f21964d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public C7524b mo22020a() {
        return new C7524b(this);
    }

    /* renamed from: m */
    public C7589q mo22021d(C7524b bVar, Bundle bundle, C7602w wVar, C7530c0.C7531a aVar) {
        Intent intent;
        int intExtra;
        boolean z;
        C41536l.m120489i(bVar, "destination");
        if (bVar.mo22030M() != null) {
            Intent intent2 = new Intent(bVar.mo22030M());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String L = bVar.mo22029L();
                if (L == null || L.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(L);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + L);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (this.f21964d == null) {
                intent2.addFlags(268435456);
            }
            if (wVar != null && wVar.mo22252g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f21964d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.mo22214w());
            Resources resources = this.f21963c.getResources();
            if (wVar != null) {
                int c = wVar.mo22247c();
                int d = wVar.mo22248d();
                if ((c <= 0 || !C41536l.m120484d(resources.getResourceTypeName(c), "animator")) && (d <= 0 || !C41536l.m120484d(resources.getResourceTypeName(d), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c) + " and popExit resource " + resources.getResourceName(d) + " when launching " + bVar);
                }
            }
            this.f21963c.startActivity(intent2);
            if (wVar == null || this.f21964d == null) {
                return null;
            }
            int a = wVar.mo22245a();
            int b = wVar.mo22246b();
            if ((a > 0 && C41536l.m120484d(resources.getResourceTypeName(a), "animator")) || (b > 0 && C41536l.m120484d(resources.getResourceTypeName(b), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a) + " and exit resource " + resources.getResourceName(b) + "when launching " + bVar);
                return null;
            } else if (a < 0 && b < 0) {
                return null;
            } else {
                this.f21964d.overridePendingTransition(C43429k.m124585d(a, 0), C43429k.m124585d(b, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(("Destination " + bVar.mo22214w() + " does not have an Intent set.").toString());
        }
    }
}

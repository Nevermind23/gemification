package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0681d;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p017b.C2101a;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f1046a = new Random();

    /* renamed from: b */
    private final Map f1047b = new HashMap();

    /* renamed from: c */
    final Map f1048c = new HashMap();

    /* renamed from: d */
    private final Map f1049d = new HashMap();

    /* renamed from: e */
    ArrayList f1050e = new ArrayList();

    /* renamed from: f */
    final transient Map f1051f = new HashMap();

    /* renamed from: g */
    final Map f1052g = new HashMap();

    /* renamed from: h */
    final Bundle f1053h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    class C0166a extends C0173b {

        /* renamed from: a */
        final /* synthetic */ String f1058a;

        /* renamed from: b */
        final /* synthetic */ C2101a f1059b;

        C0166a(String str, C2101a aVar) {
            this.f1058a = str;
            this.f1059b = aVar;
        }

        /* renamed from: b */
        public void mo386b(Object obj, C0681d dVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f1048c.get(this.f1058a);
            if (num != null) {
                ActivityResultRegistry.this.f1050e.add(this.f1058a);
                try {
                    ActivityResultRegistry.this.mo338f(num.intValue(), this.f1059b, obj, dVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f1050e.remove(this.f1058a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1059b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo387c() {
            ActivityResultRegistry.this.mo385l(this.f1058a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    class C0167b extends C0173b {

        /* renamed from: a */
        final /* synthetic */ String f1061a;

        /* renamed from: b */
        final /* synthetic */ C2101a f1062b;

        C0167b(String str, C2101a aVar) {
            this.f1061a = str;
            this.f1062b = aVar;
        }

        /* renamed from: b */
        public void mo386b(Object obj, C0681d dVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f1048c.get(this.f1061a);
            if (num != null) {
                ActivityResultRegistry.this.f1050e.add(this.f1061a);
                try {
                    ActivityResultRegistry.this.mo338f(num.intValue(), this.f1062b, obj, dVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f1050e.remove(this.f1061a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1062b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo387c() {
            ActivityResultRegistry.this.mo385l(this.f1061a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    private static class C0168c {

        /* renamed from: a */
        final C0172a f1064a;

        /* renamed from: b */
        final C2101a f1065b;

        C0168c(C0172a aVar, C2101a aVar2) {
            this.f1064a = aVar;
            this.f1065b = aVar2;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    private static class C0169d {

        /* renamed from: a */
        final C1593j f1066a;

        /* renamed from: b */
        private final ArrayList f1067b = new ArrayList();

        C0169d(C1593j jVar) {
            this.f1066a = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo388a(C1606m mVar) {
            this.f1066a.mo4906a(mVar);
            this.f1067b.add(mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo389b() {
            Iterator it = this.f1067b.iterator();
            while (it.hasNext()) {
                this.f1066a.mo4909d((C1606m) it.next());
            }
            this.f1067b.clear();
        }
    }

    /* renamed from: a */
    private void m427a(int i, String str) {
        this.f1047b.put(Integer.valueOf(i), str);
        this.f1048c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private void m428d(String str, int i, Intent intent, C0168c cVar) {
        if (cVar == null || cVar.f1064a == null || !this.f1050e.contains(str)) {
            this.f1052g.remove(str);
            this.f1053h.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        cVar.f1064a.mo403a(cVar.f1065b.mo4465c(i, intent));
        this.f1050e.remove(str);
    }

    /* renamed from: e */
    private int m429e() {
        int nextInt = this.f1046a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f1047b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f1046a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private void m430k(String str) {
        if (((Integer) this.f1048c.get(str)) == null) {
            m427a(m429e(), str);
        }
    }

    /* renamed from: b */
    public final boolean mo379b(int i, int i2, Intent intent) {
        String str = (String) this.f1047b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m428d(str, i2, intent, (C0168c) this.f1051f.get(str));
        return true;
    }

    /* renamed from: c */
    public final boolean mo380c(int i, Object obj) {
        C0172a aVar;
        String str = (String) this.f1047b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0168c cVar = (C0168c) this.f1051f.get(str);
        if (cVar == null || (aVar = cVar.f1064a) == null) {
            this.f1053h.remove(str);
            this.f1052g.put(str, obj);
            return true;
        } else if (!this.f1050e.remove(str)) {
            return true;
        } else {
            aVar.mo403a(obj);
            return true;
        }
    }

    /* renamed from: f */
    public abstract void mo338f(int i, C2101a aVar, Object obj, C0681d dVar);

    /* renamed from: g */
    public final void mo381g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f1050e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f1046a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f1053h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f1048c.containsKey(str)) {
                        Integer num = (Integer) this.f1048c.remove(str);
                        if (!this.f1053h.containsKey(str)) {
                            this.f1047b.remove(num);
                        }
                    }
                    m427a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo382h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f1048c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f1048c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f1050e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f1053h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1046a);
    }

    /* renamed from: i */
    public final C0173b mo383i(final String str, C1619q qVar, final C2101a aVar, final C0172a aVar2) {
        C1593j lifecycle = qVar.getLifecycle();
        if (!lifecycle.mo4907b().mo4914b(C1593j.C1598b.STARTED)) {
            m430k(str);
            C0169d dVar = (C0169d) this.f1049d.get(str);
            if (dVar == null) {
                dVar = new C0169d(lifecycle);
            }
            dVar.mo388a(new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    if (C1593j.C1594a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f1051f.put(str, new C0168c(aVar2, aVar));
                        if (ActivityResultRegistry.this.f1052g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f1052g.get(str);
                            ActivityResultRegistry.this.f1052g.remove(str);
                            aVar2.mo403a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f1053h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f1053h.remove(str);
                            aVar2.mo403a(aVar.mo4465c(activityResult.mo371b(), activityResult.mo370a()));
                        }
                    } else if (C1593j.C1594a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f1051f.remove(str);
                    } else if (C1593j.C1594a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.mo385l(str);
                    }
                }
            });
            this.f1049d.put(str, dVar);
            return new C0166a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + qVar + " is attempting to register while current state is " + lifecycle.mo4907b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: j */
    public final C0173b mo384j(String str, C2101a aVar, C0172a aVar2) {
        m430k(str);
        this.f1051f.put(str, new C0168c(aVar2, aVar));
        if (this.f1052g.containsKey(str)) {
            Object obj = this.f1052g.get(str);
            this.f1052g.remove(str);
            aVar2.mo403a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f1053h.getParcelable(str);
        if (activityResult != null) {
            this.f1053h.remove(str);
            aVar2.mo403a(aVar.mo4465c(activityResult.mo371b(), activityResult.mo370a()));
        }
        return new C0167b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo385l(String str) {
        Integer num;
        if (!this.f1050e.contains(str) && (num = (Integer) this.f1048c.remove(str)) != null) {
            this.f1047b.remove(num);
        }
        this.f1051f.remove(str);
        if (this.f1052g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1052g.get(str));
            this.f1052g.remove(str);
        }
        if (this.f1053h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1053h.getParcelable(str));
            this.f1053h.remove(str);
        }
        C0169d dVar = (C0169d) this.f1049d.get(str);
        if (dVar != null) {
            dVar.mo389b();
            this.f1049d.remove(str);
        }
    }
}

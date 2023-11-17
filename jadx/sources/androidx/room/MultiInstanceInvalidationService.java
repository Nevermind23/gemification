package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import he1.C41238w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p267u0.C8479l;
import p267u0.C8482m;

public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d */
    private int f5514d;

    /* renamed from: e */
    private final Map f5515e = new LinkedHashMap();

    /* renamed from: f */
    private final RemoteCallbackList f5516f = new C1843b(this);

    /* renamed from: g */
    private final C8482m.C8483a f5517g = new C1842a(this);

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public static final class C1842a extends C8482m.C8483a {

        /* renamed from: b */
        final /* synthetic */ MultiInstanceInvalidationService f5518b;

        C1842a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f5518b = multiInstanceInvalidationService;
        }

        /* renamed from: W0 */
        public void mo6105W0(int i, String[] strArr) {
            C41536l.m120489i(strArr, "tables");
            RemoteCallbackList a = this.f5518b.mo6100a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5518b;
            synchronized (a) {
                String str = (String) multiInstanceInvalidationService.mo6101b().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.mo6100a().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.mo6100a().getBroadcastCookie(i2);
                        C41536l.m120487g(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.mo6101b().get(Integer.valueOf(intValue));
                        if (i != intValue && C41536l.m120484d(str, str2)) {
                            ((C8479l) multiInstanceInvalidationService.mo6100a().getBroadcastItem(i2)).mo23749P(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.mo6100a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.mo6100a().finishBroadcast();
                C41238w wVar = C41238w.f97225a;
            }
        }

        /* renamed from: Z */
        public int mo6106Z(C8479l lVar, String str) {
            C41536l.m120489i(lVar, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a = this.f5518b.mo6100a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5518b;
            synchronized (a) {
                multiInstanceInvalidationService.mo6103d(multiInstanceInvalidationService.mo6102c() + 1);
                int c = multiInstanceInvalidationService.mo6102c();
                if (multiInstanceInvalidationService.mo6100a().register(lVar, Integer.valueOf(c))) {
                    multiInstanceInvalidationService.mo6101b().put(Integer.valueOf(c), str);
                    i = c;
                } else {
                    multiInstanceInvalidationService.mo6103d(multiInstanceInvalidationService.mo6102c() - 1);
                    multiInstanceInvalidationService.mo6102c();
                }
            }
            return i;
        }

        /* renamed from: f0 */
        public void mo6107f0(C8479l lVar, int i) {
            C41536l.m120489i(lVar, "callback");
            RemoteCallbackList a = this.f5518b.mo6100a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5518b;
            synchronized (a) {
                multiInstanceInvalidationService.mo6100a().unregister(lVar);
                String str = (String) multiInstanceInvalidationService.mo6101b().remove(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public static final class C1843b extends RemoteCallbackList {

        /* renamed from: a */
        final /* synthetic */ MultiInstanceInvalidationService f5519a;

        C1843b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f5519a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(C8479l lVar, Object obj) {
            C41536l.m120489i(lVar, "callback");
            C41536l.m120489i(obj, "cookie");
            this.f5519a.mo6101b().remove((Integer) obj);
        }
    }

    /* renamed from: a */
    public final RemoteCallbackList mo6100a() {
        return this.f5516f;
    }

    /* renamed from: b */
    public final Map mo6101b() {
        return this.f5515e;
    }

    /* renamed from: c */
    public final int mo6102c() {
        return this.f5514d;
    }

    /* renamed from: d */
    public final void mo6103d(int i) {
        this.f5514d = i;
    }

    public IBinder onBind(Intent intent) {
        C41536l.m120489i(intent, "intent");
        return this.f5517g;
    }
}

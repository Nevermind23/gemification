package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import g91.C32359z0;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.events.PlusReferralRegistrationEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.model.C35693b;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27354l1;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInvitationResultActivity */
public class PlusInvitationResultActivity extends C35357a {

    /* renamed from: I */
    private static String f85631I = "PERSON_NAME";

    /* renamed from: J */
    private static String f85632J = "ID_NUMBER";

    /* renamed from: K */
    private static String f85633K = "PHONE_NUMBER";

    /* renamed from: L */
    private static String f85634L = "SELECTED_PRODUCTS";

    /* renamed from: G */
    protected Client f85635G;

    /* renamed from: H */
    private C27354l1 f85636H;

    /* renamed from: E2 */
    private static void m104989E2(ArrayList arrayList, C35693b bVar, C24978b bVar2) {
        if (bVar2 == C24978b.YES) {
            arrayList.add(bVar);
        }
    }

    /* renamed from: F2 */
    public static void m104990F2(Activity activity, PlusReferralRegistrationEvent plusReferralRegistrationEvent) {
        Intent intent = new Intent(activity, PlusInvitationResultActivity.class);
        String str = f85631I;
        intent.putExtra(str, plusReferralRegistrationEvent.getFirstName() + " " + plusReferralRegistrationEvent.getLastName());
        intent.putExtra(f85632J, plusReferralRegistrationEvent.getIdNumber());
        intent.putExtra(f85633K, plusReferralRegistrationEvent.getPhoneNumber());
        ArrayList arrayList = new ArrayList();
        m104989E2(arrayList, C35693b.DEPOSIT, plusReferralRegistrationEvent.getDeposit());
        m104989E2(arrayList, C35693b.LOAN, plusReferralRegistrationEvent.getLoan());
        m104989E2(arrayList, C35693b.CREDIT_CARD, plusReferralRegistrationEvent.getCreditCard());
        m104989E2(arrayList, C35693b.MORTGAGE_LOAN, plusReferralRegistrationEvent.getIpo());
        m104989E2(arrayList, C35693b.SOLO, plusReferralRegistrationEvent.getSolo());
        m104989E2(arrayList, C35693b.SOLO_CLUB, plusReferralRegistrationEvent.getSoloClub());
        intent.putExtra(f85634L, arrayList);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27354l1 d = C27354l1.m84724d(getLayoutInflater());
        this.f85636H = d;
        super.mo70996D2(bundle, d);
        Intent intent = getIntent();
        this.f85636H.f69205i.setText(intent.getStringExtra(f85631I));
        this.f85636H.f69203g.setText(intent.getStringExtra(f85632J));
        this.f85636H.f69206j.setText(intent.getStringExtra(f85633K));
        Iterator it = ((ArrayList) intent.getSerializableExtra(f85634L)).iterator();
        int i = 0;
        while (it.hasNext()) {
            C35693b bVar = (C35693b) it.next();
            LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(C10324m.plus_selected_product_layout, this.f85636H.f69209m, false);
            ((TextView) linearLayout.findViewById(C10322k.product_name)).setText(bVar.mo86825c());
            ((TextView) linearLayout.findViewById(C10322k.f28733Fp)).setText(String.format("%s %s", new Object[]{C32359z0.m95530A((long) bVar.mo86824b()), getString(C10328q.f28959ib)}));
            i += bVar.mo86824b();
            this.f85636H.f69209m.addView(linearLayout);
        }
        if (this.f85635G.getUserInfo().getClient().isSoloClient()) {
            this.f85636H.f69211o.setVisibility(8);
            return;
        }
        this.f85636H.f69207k.setText(String.format("%s %s", new Object[]{C32359z0.m95530A((long) i), getString(C10328q.f28959ib)}));
    }
}

package g81;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32315k0;
import g91.C32335t0;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;
import r90.C27954d;

/* renamed from: g81.b0 */
public class C32127b0 extends RecyclerView.C1736h {

    /* renamed from: d */
    private final PaymentServiceConfig f79075d;

    /* renamed from: e */
    private final boolean f79076e;

    /* renamed from: f */
    private ArrayList f79077f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f79078g;

    /* renamed from: h */
    private final Client f79079h;

    /* renamed from: g81.b0$a */
    class C32128a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ Intent f79080d;

        C32128a(Intent intent) {
            this.f79080d = intent;
        }

        public void onClick(View view) {
            C32127b0.this.f79078g.startActivity(this.f79080d);
        }
    }

    /* renamed from: g81.b0$b */
    public class C32129b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79082d;

        /* renamed from: e */
        BogTextView f79083e;

        /* renamed from: f */
        BogTextView f79084f;

        /* renamed from: g */
        BogTextView f79085g;

        /* renamed from: h */
        View f79086h;

        /* renamed from: i */
        ImageView f79087i;

        /* renamed from: j */
        View f79088j;

        /* renamed from: k */
        View f79089k;

        public C32129b(View view) {
            super(view);
            this.f79082d = (BogTextView) view.findViewById(C10322k.f28878p1);
            this.f79083e = (BogTextView) view.findViewById(C10322k.f28741Hf);
            this.f79084f = (BogTextView) view.findViewById(C10322k.footer_text);
            this.f79085g = (BogTextView) view.findViewById(C10322k.error_message_tv);
            this.f79086h = view.findViewById(C10322k.item_to_click);
            this.f79087i = (ImageView) view.findViewById(C10322k.icon_iv);
            this.f79088j = view.findViewById(C10322k.item_divider);
            View findViewById = view.findViewById(C10322k.loader_view);
            this.f79089k = findViewById;
            findViewById.setAlpha(Utils.FLOAT_EPSILON);
        }

        /* renamed from: h */
        public void mo72615h() {
            this.f79089k.setAlpha(Utils.FLOAT_EPSILON);
            this.f79089k.clearAnimation();
        }

        /* renamed from: i */
        public void mo72616i() {
            this.f79089k.setAlpha(0.8f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, 0.8f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setRepeatCount(-1);
            this.f79089k.setAnimation(alphaAnimation);
            alphaAnimation.startNow();
        }
    }

    public C32127b0(Context context, PaymentServiceConfig paymentServiceConfig, boolean z, Client client) {
        this.f79078g = context;
        this.f79075d = paymentServiceConfig;
        this.f79076e = z;
        this.f79079h = client;
    }

    /* renamed from: g */
    public void onBindViewHolder(C32129b bVar, int i) {
        PaymentProviderConfiguration paymentProviderConfiguration;
        PaymentExecuteEssObject paymentExecuteEssObject = (PaymentExecuteEssObject) this.f79077f.get(i);
        Intent intent = new Intent(this.f79078g, PaymentResultActivity.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(paymentExecuteEssObject);
        intent.putExtra("PAYMENT_EXECUTED_DATA_OBJECT", C42035e.m122121c(arrayList));
        PaymentServiceConfig paymentServiceConfig = this.f79075d;
        if (paymentServiceConfig != null) {
            intent.putExtra("PAYMENT_SERVICE_CONFIG_JSON", C42035e.m122121c(paymentServiceConfig));
        }
        intent.putExtra("PAYMENT_OTHER_CARD", this.f79076e);
        bVar.f79085g.setVisibility(8);
        bVar.f79084f.setVisibility(0);
        String s = C32315k0.m95270s(paymentExecuteEssObject);
        if ("N".equals(s)) {
            bVar.f79084f.setTextColor(C32335t0.m95358c(this.f79078g));
            bVar.f79084f.setText(C10328q.payments_result_payment_is_in_progress);
            bVar.mo72616i();
        } else if ("R".equals(s)) {
            bVar.f79084f.setTextColor(C0767a.m2893c(this.f79078g, C10318g.bog_error_red));
            bVar.f79084f.setText(C10328q.payments_result_not_paid);
            bVar.f79085g.setVisibility(0);
            if (paymentExecuteEssObject.getErrorDictionaryKey() != null) {
                bVar.f79085g.setText(C27950a.m86284a(paymentExecuteEssObject.getErrorDictionaryKey()));
            } else {
                bVar.f79085g.setText(this.f79078g.getString(C10328q.f28940T1));
            }
            bVar.mo72615h();
        } else if ("P".equals(s)) {
            bVar.f79084f.setTextColor(C0767a.m2893c(this.f79078g, C10318g.bog_dialog_green_color));
            bVar.f79084f.setText(C10328q.payments_result_succesfull_result_text);
            bVar.mo72615h();
        } else if (BankApiResponse.CODE_STATUS_WARNING.equals(s)) {
            bVar.f79084f.setVisibility(8);
            bVar.f79085g.setVisibility(0);
            bVar.f79085g.setTextColor(C32335t0.m95358c(this.f79078g));
            bVar.f79085g.setText(C27950a.m86284a(paymentExecuteEssObject.getErrorDictionaryKey()));
            bVar.mo72616i();
        }
        if (!"N".equals(s)) {
            bVar.f79086h.setOnClickListener(new C32128a(intent));
        }
        PaymentServiceConfig paymentServiceConfig2 = this.f79075d;
        if (paymentServiceConfig2 != null) {
            paymentProviderConfiguration = C27954d.m86302h(paymentServiceConfig2.getId());
        } else if (paymentExecuteEssObject.getEssServiceId() != null) {
            paymentProviderConfiguration = C27954d.m86301g(paymentExecuteEssObject.getEssServiceId().replace("mep-", ""));
        } else {
            paymentProviderConfiguration = null;
        }
        if (paymentProviderConfiguration == null) {
            try {
                paymentProviderConfiguration = this.f79079h.getPaymentConfigurationByTemplateId(Long.valueOf(C32315k0.m95276y(paymentExecuteEssObject.getEssParameters())).longValue());
            } catch (Exception unused) {
            }
        }
        String z = C32315k0.m95277z(paymentExecuteEssObject.getEssParameters());
        if (z != null && !z.equals("")) {
            bVar.f79083e.setText(z);
        } else if (paymentProviderConfiguration != null) {
            bVar.f79083e.setText(C27950a.m86286c(paymentProviderConfiguration.getProviderName(), true));
        }
        if (paymentProviderConfiguration != null) {
            String c = C32289b0.m95091c(paymentProviderConfiguration.getLogo());
            ImageView imageView = bVar.f79087i;
            int i2 = C10320i.f28688dc;
            C32289b0.m95107s(imageView, c, Integer.valueOf(i2), Integer.valueOf(i2), true, false);
        }
        bVar.f79082d.setText(C32359z0.m95539J(String.valueOf(new BigDecimal(C32315k0.m95248C("amount", paymentExecuteEssObject.getEssParameters())).divide(new BigDecimal(100)).add(BigDecimal.valueOf(Double.parseDouble(paymentExecuteEssObject.getPaymentCommission())).divide(new BigDecimal(100))).setScale(2, 1))));
    }

    public int getItemCount() {
        ArrayList arrayList = this.f79077f;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return 0 + this.f79077f.size();
    }

    /* renamed from: h */
    public C32129b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32129b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payment_result_list_item, viewGroup, false));
    }

    /* renamed from: i */
    public void onViewAttachedToWindow(C32129b bVar) {
        super.onViewAttachedToWindow(bVar);
        if ("N".equals(C32315k0.m95270s((PaymentExecuteEssObject) this.f79077f.get(bVar.getLayoutPosition())))) {
            bVar.mo72616i();
        } else {
            bVar.mo72615h();
        }
    }

    /* renamed from: j */
    public void onViewDetachedFromWindow(C32129b bVar) {
        super.onViewDetachedFromWindow(bVar);
        bVar.f79089k.clearAnimation();
    }

    /* renamed from: k */
    public void mo72613k(ArrayList arrayList) {
        this.f79077f = arrayList;
        notifyDataSetChanged();
    }
}

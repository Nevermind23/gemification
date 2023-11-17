package p341ge.bog.mobilebank.p975ui.widgets.rates;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.github.mikephil.charting.utils.Utils;
import g91.C32296c1;
import g91.C32314k;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10320i;
import p366bk.C10322k;
import p530nf.C16919b;

/* renamed from: ge.bog.mobilebank.ui.widgets.rates.a */
public class C35829a implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private Context f86546a;

    /* renamed from: b */
    private List f86547b;

    /* renamed from: c */
    private int f86548c;

    /* renamed from: d */
    PreferencesApiManager f86549d;

    /* renamed from: ge.bog.mobilebank.ui.widgets.rates.a$a */
    interface C35830a {
        /* renamed from: a */
        PreferencesApiManager mo32851a();
    }

    C35829a(Context context, Intent intent) {
        this.f86546a = context;
        this.f86548c = intent.getIntExtra("widget_size", 3);
    }

    public int getCount() {
        return this.f86547b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i) {
        int i2;
        int i3;
        int i4;
        if (this.f86547b.size() <= 0) {
            return null;
        }
        CcyRate ccyRate = (CcyRate) this.f86547b.get(i);
        RemoteViews remoteViews = new RemoteViews(this.f86546a.getPackageName(), C32296c1.m95142b(this.f86548c));
        if (ccyRate.getRateWeight() > 0) {
            int i5 = C10322k.ccy_logo;
            remoteViews.setTextViewText(i5, C32314k.m95245a(ccyRate.getCcy()));
            if (this.f86548c == 3) {
                remoteViews.setTextViewText(C10322k.ccy_name, ccyRate.getCcy());
            }
            BigDecimal currentRate = ccyRate.getCurrentRate();
            if (currentRate != null) {
                remoteViews.setTextViewText(C10322k.official_rate, String.valueOf(currentRate.setScale(4, RoundingMode.UP)));
            }
            if (this.f86548c != 1) {
                BigDecimal dgtlSellRate = ccyRate.getDgtlSellRate();
                BigDecimal dgtlBuyRate = ccyRate.getDgtlBuyRate();
                if (dgtlSellRate != null) {
                    remoteViews.setTextViewText(C10322k.sell_rate, String.valueOf(dgtlSellRate.setScale(4, RoundingMode.UP)));
                }
                if (dgtlBuyRate != null) {
                    remoteViews.setTextViewText(C10322k.buy_rate, String.valueOf(dgtlBuyRate.setScale(4, RoundingMode.UP)));
                }
                int i6 = C10322k.bad_sell_rate;
                remoteViews.setInt(i6, "setPaintFlags", 17);
                int i7 = C10322k.bad_buy_rate;
                remoteViews.setInt(i7, "setPaintFlags", 17);
                remoteViews.setTextViewText(i6, "");
                remoteViews.setTextViewText(i7, "");
                BigDecimal sellRate = ccyRate.getSellRate();
                BigDecimal buyRate = ccyRate.getBuyRate();
                if (sellRate != null) {
                    remoteViews.setTextViewText(i6, String.valueOf(sellRate.setScale(4, RoundingMode.UP)));
                }
                if (buyRate != null) {
                    remoteViews.setTextViewText(i7, String.valueOf(buyRate.setScale(4, RoundingMode.UP)));
                }
            }
            BigDecimal difference = ccyRate.getDifference();
            int i8 = C10320i.ccy_logo_background_default;
            if (difference != null) {
                if (difference.doubleValue() > Utils.DOUBLE_EPSILON) {
                    i3 = C10320i.widget_ccy_down;
                    i4 = C10320i.ccy_logo_background_red;
                } else if (difference.doubleValue() < Utils.DOUBLE_EPSILON) {
                    i3 = C10320i.widget_ccy_up;
                    i4 = C10320i.ccy_logo_background_green;
                } else {
                    i2 = -1;
                    remoteViews.setTextViewText(C10322k.rate_change, String.valueOf(difference.abs().setScale(4, RoundingMode.UP)));
                }
                int i9 = i4;
                i2 = i3;
                i8 = i9;
                remoteViews.setTextViewText(C10322k.rate_change, String.valueOf(difference.abs().setScale(4, RoundingMode.UP)));
            } else {
                remoteViews.setTextViewText(C10322k.rate_change, "");
                i2 = -1;
            }
            remoteViews.setInt(i5, "setBackgroundResource", i8);
            if (i2 == -1) {
                remoteViews.setViewVisibility(C10322k.diff_indicator, 8);
            } else {
                int i12 = C10322k.diff_indicator;
                remoteViews.setViewVisibility(i12, 0);
                remoteViews.setImageViewResource(i12, i2);
            }
        }
        remoteViews.setOnClickFillInIntent(C10322k.currency_rate_widget_item, new Intent());
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void onCreate() {
        this.f86547b = new ArrayList();
        this.f86549d = ((C35830a) C16919b.m59518a(this.f86546a, C35830a.class)).mo32851a();
    }

    public void onDataSetChanged() {
        this.f86547b.clear();
        if (this.f86549d.getCcyRates() != null) {
            for (CcyRate ccyRate : this.f86549d.getCcyRates().getList()) {
                if (ccyRate.getCcy().equals("USD") || ccyRate.getCcy().equals("EUR")) {
                    this.f86547b.add(ccyRate);
                }
            }
        }
    }

    public void onDestroy() {
        this.f86547b = null;
    }
}

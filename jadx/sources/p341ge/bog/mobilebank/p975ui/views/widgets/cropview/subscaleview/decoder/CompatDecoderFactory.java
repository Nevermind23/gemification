package p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.decoder.CompatDecoderFactory */
public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> cls) {
        this.clazz = cls;
    }

    public T make() {
        return this.clazz.newInstance();
    }
}

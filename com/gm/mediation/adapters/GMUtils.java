package com.gm.mediation.adapters;

import android.text.TextUtils;
import android.util.Log;

import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GMUtils {
    private static final String TAG = "GMUtils";

    public static double get7012RewardPrice(Object object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object d2 = findNameObject("d", d1);
            Object b1 = findNameObject("b", d2);
            Object c1 = findNameObject("c", b1);
            if (c1 != null) {
                if (c1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) c1);
                    for (Object o : list) {
                        double c = findEcpm("fu", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }


        } catch (Throwable e) {
        }
        if (cpm <= 0) {
            return get7012Reward2Price(object);
        }
        return cpm;

    }

    private static double get7012Reward2Price(Object object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object t1 = findNameObject("t", d1);
            Object bt1 = findNameObject("bt", t1);
            Object e1 = findNameObject("e", bt1);
            if (e1 != null) {
                if (e1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) e1);
                    for (Object o : list) {
                        double c = findEcpm("cb", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        if (cpm <= 0) {
            return get7012RewardXZPrice(object);
        }
        return cpm;

    }

    private static double get7012RewardXZPrice(Object object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object x1 = findNameObject("x", d1);
            Object t1 = findNameObject("t", x1);
            Object ao1 = findNameObject("ao", t1);
            if (ao1 != null) {
                if (ao1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) ao1);
                    for (Object o : list) {
                        double c = findEcpm("xz", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        return cpm;

    }

    public static double get7012NativePrice(TTFeedAd ttFeedAd) {
        Object object = ttFeedAd.getMediationManager();
        if (object == null) return get7012NativeFuPrice(ttFeedAd);
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object d2 = findNameObject("d", d1);
            Object d3 = findNameObject("d", d2);
            cpm = findEcpm("fu", d3);

        } catch (Throwable e) {
        }
        if (cpm == 0) {
            return get7012NativeXZPrice(ttFeedAd);
        }
        return cpm;

    }

    public static double get7012NativeFuPrice(Object ttFeedAd) {
        if (ttFeedAd == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", ttFeedAd);
            Object hc = findNameObject("hc", d1);
            cpm = findEcpm("fu", hc);

        } catch (Throwable e) {
        }
        return cpm;

    }

    public static double get7012NativeXZPrice(TTFeedAd object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object oe1 = findNameObject("oe", d1);
            cpm = findEcpm("xz", oe1);
            if (cpm == 0) {
                Object il = findNameObject("il", oe1);
                if (il != null) {
                    cpm = Double.parseDouble(il.toString());
                }
            }
        } catch (Throwable e) {
        }
        return cpm;

    }

    public static double get7012BannerPrice(TTNativeExpressAd ttFeedAd) {
        Object object = ttFeedAd.getMediationManager();
        if (object == null) return get7012BannerFuPrice(ttFeedAd);
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object d2 = findNameObject("d", d1);
            Object d3 = findNameObject("d", d2);
            Object c1 = findNameObject("c", d3);
            Object b1 = findNameObject("b", c1);
            Object c2 = findNameObject("c", b1);
            if (c2 != null) {
                if (c2 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) c2);
                    for (Object o : list) {
                        double c = findEcpm("fu", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        if (cpm <= 0) {
            return get7012Banner2Price(ttFeedAd);
        }
        return cpm;

    }

    public static double get7012BannerFuPrice(Object ttFeedAd) {
        if (ttFeedAd == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", ttFeedAd);
            Object d2 = findNameObject("d", d1);
            Object c1 = findNameObject("c", d2);
            Object c2 = findNameObject("c", c1);
            cpm = findEcpm("fu", c2);

        } catch (Throwable e) {
        }
        return cpm;

    }

    private static double get7012Banner2Price(TTNativeExpressAd ttFeedAd) {
        Object object = ttFeedAd.getMediationManager();
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object t1 = findNameObject("t", d1);
            Object t2 = findNameObject("t", t1);
            Object e1 = findNameObject("e", t2);
            Object bt1 = findNameObject("bt", e1);
            Object e2 = findNameObject("e", bt1);
            if (e2 != null) {
                if (e2 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) e2);
                    for (Object o : list) {
                        double c = findEcpm("cb", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        return cpm;

    }

    public static double get7012InterstitialPrice(TTFullScreenVideoAd ttFeedAd) {
        Object object = ttFeedAd.getMediationManager();
        if (object == null) return get7012InterstitialCbPrice(ttFeedAd);
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object t1 = findNameObject("t", d1);
            Object t2 = findNameObject("t", t1);
            Object bt1 = findNameObject("bt", t2);
            Object e1 = findNameObject("e", bt1);
            if (e1 != null) {
                if (e1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) e1);
                    for (Object o : list) {
                        double c = findEcpm("cb", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }

        if (cpm <= 0) {
            return get7012Interstitial2Price(ttFeedAd);
        }
        return cpm;

    }

    private static double get7012Interstitial2Price(TTFullScreenVideoAd ttFeedAd) {
        Object object = ttFeedAd.getMediationManager();
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object d2 = findNameObject("d", d1);
            Object d3 = findNameObject("d", d2);
            Object b1 = findNameObject("b", d3);
            Object c1 = findNameObject("c", b1);
            if (c1 != null) {
                if (c1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) c1);
                    for (Object o : list) {
                        double c = findEcpm("fu", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }

        return cpm;

    }

    public static double get7012InterstitialCbPrice(Object object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object t1 = findNameObject("t", d1);
            Object bt1 = findNameObject("bt", t1);
            Object e1 = findNameObject("e", bt1);
            if (e1 != null) {
                if (e1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) e1);
                    for (Object o : list) {
                        double c = findEcpm("cb", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        if (cpm == 0) {
            return get7012InterstitialFuPrice(object);
        }
        return cpm;

    }

    public static double get7012InterstitialFuPrice(Object object) {
        if (object == null) return 0;
        double cpm = 0;
        try {
            Object d1 = findNameObject("d", object);
            Object d2 = findNameObject("d", d1);
            Object b1 = findNameObject("b", d2);
            Object c1 = findNameObject("c", b1);
            if (c1 != null) {
                if (c1 instanceof CopyOnWriteArrayList) {
                    CopyOnWriteArrayList list = ((CopyOnWriteArrayList) c1);
                    for (Object o : list) {
                        double c = findEcpm("fu", o);
                        if (c > cpm) {
                            cpm = c;
                        }
                    }
                }
            }

        } catch (Throwable e) {
        }
        return cpm;

    }

    public static Object findNameObject(String name, Object object) {
        if (object == null) return null;
        try {
            Class objectClass = object.getClass();
            Field[] fields = getSuperclassFieldList(objectClass);
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getName().equals(name)) {
                    return field.get(object);
                }
            }
        } catch (Throwable e) {
        }
        return null;

    }

    public static Object findTypeObject(String name, Object object) {
        if (object == null) return null;
        try {
            Class objectClass = object.getClass();
            Field[] fields = getSuperclassFieldList(objectClass);
            for (Field field : fields) {
                field.setAccessible(true);
                Object o = field.get(object);
                if (o != null && o.getClass().getName().equals(name)) {
                    return field.get(object);
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;

    }

    private static double findEcpm(String name, Object kimObject) {
        if (kimObject == null) return 0;
        double ecpm = 0;
        try {
            Object newmbAdObject = findNameObject(name, kimObject);
            if (newmbAdObject != null) {
                String newmbAdObjectStr = newmbAdObject.toString();
                if (newmbAdObjectStr.startsWith("{")) {
                    org.json.JSONObject jsonObject = new org.json.JSONObject(newmbAdObjectStr);
                    if (jsonObject.has("bidding_rit_cpm")) {
                        ecpm = Float.parseFloat(jsonObject.getString("bidding_rit_cpm"));
                    }
                }
            }
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedNumber = df.format(ecpm);
            ecpm = Double.parseDouble(formattedNumber);
        } catch (Throwable e) {
        }

        return ecpm;
    }

    public static Field[] getSuperclassFieldList(Class<?> superclass) throws Exception {

        Class<?> priceClass = superclass;
        List<Field> fieldList = new ArrayList<>();

        while (priceClass != null) {
            Field[] fields = priceClass.getDeclaredFields();
            fieldList.addAll(Arrays.asList(fields));
            priceClass = priceClass.getSuperclass();
        }
        return fieldList.toArray(new Field[0]);
    }
}

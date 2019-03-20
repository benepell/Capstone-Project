package info.pelleritoudacity.android.rcapstone.data.rest;


import android.content.Context;
import android.support.annotation.NonNull;

import java.util.HashMap;

import info.pelleritoudacity.android.rcapstone.data.model.reddit.T5;
import info.pelleritoudacity.android.rcapstone.data.rest.util.RetrofitClient;
import info.pelleritoudacity.android.rcapstone.service.RedditAPI;
import info.pelleritoudacity.android.rcapstone.utility.Costant;
import info.pelleritoudacity.android.rcapstone.utility.Preference;
import info.pelleritoudacity.android.rcapstone.utility.TextUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class SearchExecute {

    private static RedditAPI sApi;
    private final OnRestCallBack mCallback;
    private final String mCode;
    private final String mStrSearch;
    private final String mType;
    private final Context mContext;

    public SearchExecute(OnRestCallBack callback, Context context, String code, String strSearch, String type) {

        sApi = RetrofitClient.createService(Costant.REDDIT_OAUTH_URL, null);

        mCallback = callback;
        mContext = context;
        mCode = code;
        mStrSearch = strSearch;
        mType = type;

    }

    public void getSearch() {

        HashMap<String, String> mFieldMap;

        mFieldMap = new HashMap<>();
        mFieldMap.put("type", mType);
        mFieldMap.put("limit", String.valueOf(Preference.getGeneralSettingsItemPage(mContext)));
        mFieldMap.put("q", mStrSearch);
        mFieldMap.put("after", "");

        sApi.getSearchAuth(TextUtil.authCode(mCode),
                mFieldMap).enqueue(new Callback<T5>() {
            @Override
            public void onResponse(@NonNull Call<T5> call, @NonNull Response<T5> response) {
                mCallback.success(response.body(), response.code());

            }

            @Override
            public void onFailure(@NonNull Call<T5> call, @NonNull Throwable t) {
                Timber.e("SUBSCRIBE ERROR %s", t.getMessage());
            }
        });

    }


    public interface OnRestCallBack {

        void success(T5 response, @SuppressWarnings("unused") int code);

    }

}


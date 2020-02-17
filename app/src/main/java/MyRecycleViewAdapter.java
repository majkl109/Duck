import android.content.Context;
import android.view.LayoutInflater;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    MyRecycleViewAdapter(Context context, List<String> data){
     this.mInflater = LayoutInflater.from(context);
     this.mData = data;
    }
}

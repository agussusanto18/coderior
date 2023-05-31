package com.coderior.app.adapters;

// CardAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.coderior.app.R;

public class HomeCardAdapter extends RecyclerView.Adapter<HomeCardAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Set up data for each card item
    }

    @Override
    public int getItemCount() {
        // Return the number of items in the grid
        return 6; // Replace with the actual count
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.courseCardView);
        }
    }
}

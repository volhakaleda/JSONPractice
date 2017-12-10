package nyc.c4q.jsoninclassjose;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    List<String> messages;

    public MessageAdapter(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_layout, parent, false);
        return new MessageViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        String currentMessage = messages.get(position);

        holder.onBind(currentMessage);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}

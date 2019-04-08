//package edu.cnm.deepdive.wifinder.controller;
//
//import static javafx.scene.input.KeyCode.R;
//
//import javafx.scene.image.ImageView;
//import javax.annotation.Nullable;
//
//public class ImageClass {
//Glide.with(this)
//    .load(arguments.getInt(KEY_IMAGE_RES)) // Load the image resource
//      .listener(new RequestListener<Drawable>() {
//    @Override
//    public boolean onLoadFailed(@Nullable GlideException e, Object model,
//        Target<Drawable> target, boolean isFirstResource) {
//      getParentFragment().startPostponedEnterTransition();
//      return false;
//    }
//
//    @Override
//    public boolean onResourceReady(Drawable resource, Object model,
//        Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
//      getParentFragment().startPostponedEnterTransition();
//      return false;
//    }
//  })
//      .into((ImageView) view.findViewById(R.id.image));
//}

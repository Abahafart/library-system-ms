package com.arch.users.application.ports.input;

import com.arch.users.application.BarcodeManagement;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import io.vavr.control.Try;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import org.springframework.stereotype.Component;

@Component
public class BarcodeManagementInputPort implements BarcodeManagement {

  @Override
  public String generate(String cardNumber) {
    return Try.of(() -> {
      BitMatrix bitMatrix = new MultiFormatWriter().encode(cardNumber, BarcodeFormat.CODE_128, 300, 100);
      BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      javax.imageio.ImageIO.write(image, "png", baos);
      return Base64.getEncoder().encodeToString(baos.toByteArray());
    }).recover(Exception.class, "").get();
  }
}

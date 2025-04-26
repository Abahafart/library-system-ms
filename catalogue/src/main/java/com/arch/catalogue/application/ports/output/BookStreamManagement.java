package com.arch.catalogue.application.ports.output;

import com.arch.catalogue.domain.BookDO;

public interface BookStreamManagement {

  void notificationNewBook(BookDO bookDO);

}

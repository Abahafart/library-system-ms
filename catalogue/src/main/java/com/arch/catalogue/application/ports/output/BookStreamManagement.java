package com.arch.catalogue.application.ports.output;

import com.arch.commons.domain.BookDO;

public interface BookStreamManagement {

  void notificationNewBook(BookDO bookDO);

}

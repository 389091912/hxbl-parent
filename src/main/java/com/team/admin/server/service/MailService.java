package com.team.admin.server.service;

import java.util.List;

import com.team.admin.server.model.Mail;

public interface MailService {

	void save(Mail mail, List<String> toUser);
}

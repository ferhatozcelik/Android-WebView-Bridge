package com.ferhatozcelik.webnavite

import java.util.regex.Matcher
import java.util.regex.Pattern

class Cons {
    companion object{
        fun removeUTFCharacters(data: String): StringBuffer? {
            val p: Pattern = Pattern.compile("\\\\u(\\p{XDigit}{4})")
            val m: Matcher = p.matcher(data)
            val buf = StringBuffer(data.length)
            while (m.find()) {
                val ch: String = m.group(1)?.toInt(16).toString()
                m.appendReplacement(buf, Matcher.quoteReplacement(ch))
            }
            m.appendTail(buf)

            return buf
        }

        var HTML  = "<!DOCTYPE html>\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "  <head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (min-width: 620px) {\n" +
                "        .u-row {\n" +
                "          width: 600px !important;\n" +
                "        }\n" +
                "\n" +
                "        .u-row .u-col {\n" +
                "          vertical-align: top;\n" +
                "        }\n" +
                "\n" +
                "        .u-row .u-col-100 {\n" +
                "          width: 600px !important;\n" +
                "        }\n" +
                "      }\n" +
                "\n" +
                "      @media (max-width: 620px) {\n" +
                "        .u-row-container {\n" +
                "          max-width: 100% !important;\n" +
                "          padding-left: 0px !important;\n" +
                "          padding-right: 0px !important;\n" +
                "        }\n" +
                "\n" +
                "        .u-row .u-col {\n" +
                "          min-width: 320px !important;\n" +
                "          max-width: 100% !important;\n" +
                "          display: block !important;\n" +
                "        }\n" +
                "\n" +
                "        .u-row {\n" +
                "          width: calc(100% - 40px) !important;\n" +
                "        }\n" +
                "\n" +
                "        .u-col {\n" +
                "          width: 100% !important;\n" +
                "        }\n" +
                "\n" +
                "        .u-col>div {\n" +
                "          margin: 0 auto;\n" +
                "        }\n" +
                "      }\n" +
                "\n" +
                "      body {\n" +
                "        margin: 0;\n" +
                "        padding: 0;\n" +
                "      }\n" +
                "\n" +
                "      table,\n" +
                "      tr,\n" +
                "      td {\n" +
                "        vertical-align: top;\n" +
                "        border-collapse: collapse;\n" +
                "      }\n" +
                "\n" +
                "      p {\n" +
                "        margin: 0;\n" +
                "      }\n" +
                "\n" +
                "      .ie-container table,\n" +
                "      .mso-container table {\n" +
                "        table-layout: fixed;\n" +
                "      }\n" +
                "\n" +
                "      * {\n" +
                "        line-height: inherit;\n" +
                "      }\n" +
                "\n" +
                "      a[x-apple-data-detectors='true'] {\n" +
                "        color: inherit !important;\n" +
                "        text-decoration: none !important;\n" +
                "      }\n" +
                "\n" +
                "      table,\n" +
                "      td {\n" +
                "        color: #000000;\n" +
                "      }\n" +
                "\n" +
                "      #u_body a {\n" +
                "        color: #0000ee;\n" +
                "        text-decoration: underline;\n" +
                "      }\n" +
                "\n" +
                "      @media (max-width: 480px) {\n" +
                "        #u_content_text_1 .v-container-padding-padding {\n" +
                "          padding: 30px 10px 10px !important;\n" +
                "        }\n" +
                "\n" +
                "        #u_content_button_1 .v-container-padding-padding {\n" +
                "          padding: 10px !important;\n" +
                "        }\n" +
                "\n" +
                "        #u_content_button_1 .v-size-width {\n" +
                "          width: 65% !important;\n" +
                "        }\n" +
                "      }\n" +
                "    </style>\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Rubik:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "  </head>\n" +
                "  <body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #ffffff;color: #000000\">\n" +
                "    <table id=\"u_body\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #ffffff;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "      <tbody>\n" +
                "        <tr style=\"vertical-align: top\">\n" +
                "          <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "            <div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "              <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "                <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\n" +
                "                  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "                    <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "                      <div style=\"height: 100%; padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\n" +
                "                        <table style=\"font-family:'Rubik',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Rubik',sans-serif;\" align=\"left\">\n" +
                "                                <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "                                  <tr>\n" +
                "                                    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "                                      <img align=\"center\" border=\"0\"  alt=\"\" title=\"\" \n" +
                "\t\t\t\t\t\t\t\t\t  style=\"outline: none;text-decoration: none;-ms-interpolation-mode: \n" +
                "\t\t\t\t\t\t\t\t\t  bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 100%;max-width: 20%;\" width=\"20\" />\n" +
                "                                    </td>\n" +
                "                                  </tr>\n" +
                "                                </table>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                        <table id=\"u_content_text_1\" style=\"font-family:'Rubik',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 100px;font-family:'Rubik',sans-serif;\" align=\"left\">\n" +
                "                                <div style=\"line-height: 120%; text-align: center; word-wrap: break-word;\">\n" +
                "                                  <p style=\"font-size: 14px; line-height: 120%;\">\n" +
                "                                    <span style=\"font-size: 24px; line-height: 28.8px;\">\n" +
                "                                      <strong>Test</strong>\n" +
                "                                    </span>\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                        <table id=\"u_content_button_1\" style=\"font-family:'Rubik',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td class=\"v-container-padding-padding\" style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Rubik',sans-serif;\" align=\"left\">\n" +
                "                                <div align=\"center\">\n" +
                "                                  <a id=\"buttontest\" target=\"_blank\" class=\"v-button v-size-width\" style=\"box-sizing: border-box;display: inline-block;font-family:'Rubik',sans-serif;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #FFFFFF; background-color: #040404; border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px; width:27%; max-width:100%; overflow-wrap: break-word; word-break: break-word; word-wrap:break-word; mso-border-alt: none;\">\n" +
                "                                    <span style=\"display:block;padding:10px 20px;line-height:120%;\">\n" +
                "                                      <strong>\n" +
                "                                        <span style=\"font-size: 14px; line-height: 16.8px;\">Buy</span>\n" +
                "                                      </strong>\n" +
                "                                    </span>\n" +
                "                                  </a>" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  </body>\n" +
                "</html>"

    }
}
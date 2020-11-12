Feature: Send Email - Outlook Desktop
  I how QA automation
  I need send a email from Outlook
  For automation send notification

  Scenario Outline: Send Email From Outlook
    Given "Demo AutoIT" want to open aplication
      | <app> |
    When I wish send a email from Outlook with data
      | to   | subject   | content   |
      | <to> | <subject> | <content> |
    Then I verify that the email was sent

    Examples:
      | app     | to                                  | subject        | content                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
      | Outlook | rigoberto.henao@sophossolutions.com | Webinar Legado | lorem ipsum dolor sit amet, consectetur adipiscing elit. nulla iaculis auctor rhoncus. in sed tempus turpis. proin interdum, justo vitae porta congue, augue enim fringilla risus, sit amet viverra dolor mauris a enim. nulla rutrum vestibulum nibh quis sollicitudin. pellentesque aliquet nulla quis lacinia venenatis. curabitur massa mi, aliquet non elementum at, vestibulum non nunc. vivamus placerat feugiat nisl, eget malesuada libero feugiat in. pellentesque ullamcorper rutrum erat, in hendrerit ante dapibus at |

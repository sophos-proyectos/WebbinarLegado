Feature: Send Email - Outlook Desktop
  I how QA Automation
  I need send a email from Outlook
  For automation send notification

  Scenario Outline: Send Email From Outlook
    Given "Demo AutoIT" want to open aplication
      |<app>|
    When I wish send a email from Outlook with data
      |destinatario | asunto | contenido|
      |<destinatario> | <asunto> | <contenido>|
    Then I verify that the email was sent

    Examples:
      |app|destinatario | asunto | contenido|
      |Outlook| rigoberto.henao@sophossolutions.com| Webinar Legado|Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla iaculis auctor rhoncus. In sed tempus turpis. Proin interdum, justo vitae porta congue, augue enim fringilla risus, sit amet viverra dolor mauris a enim. Nulla rutrum vestibulum nibh quis sollicitudin. Pellentesque aliquet nulla quis lacinia venenatis. Curabitur massa mi, aliquet non elementum at, vestibulum non nunc. Vivamus placerat feugiat nisl, eget malesuada libero feugiat in. Pellentesque ullamcorper rutrum erat, in hendrerit ante dapibus at|
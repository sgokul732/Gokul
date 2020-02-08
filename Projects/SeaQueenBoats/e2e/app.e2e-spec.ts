import { SeaQueenBoatsPage } from './app.po';

describe('sea-queen-boats App', () => {
  let page: SeaQueenBoatsPage;

  beforeEach(() => {
    page = new SeaQueenBoatsPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
